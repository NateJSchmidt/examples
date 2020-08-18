package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"

	"github.com/gorilla/mux"
)

// Credentials stores client credential
type Credentials struct {
	Username string
	Password string
}

// LoginResult contains the response of a login attempt from a client
type LoginResult struct {
	Success bool
	Message string
}

// HomeHandler handles default REST requests with a 404
func homeHandler(response http.ResponseWriter, request *http.Request) {
	fmt.Println("Received a request to /, sending 404")
	response.WriteHeader(http.StatusNotFound)
}

//loginHandler handles REST requests to log in
func loginHandler(response http.ResponseWriter, request *http.Request) {
	var creds Credentials

	err := json.NewDecoder(request.Body).Decode(&creds)
	if err != nil {
		http.Error(response, err.Error(), http.StatusBadRequest)
		return
	}

	fmt.Println("Received a login request from", creds.Username, "with password:", creds.Password)
	response.Header().Set("Content-Type", "application/json")

	loginResult, _ := json.Marshal(LoginResult{Success: true, Message: fmt.Sprintf("Hello %s", creds.Username)})

	fmt.Fprintf(response, string(loginResult))
}

func main() {
	fmt.Println("Hello world!")

	r := mux.NewRouter()
	r.HandleFunc("/login", loginHandler).Schemes("https").Methods("POST")
	r.HandleFunc("/", homeHandler)
	http.Handle("/", r)

	fmt.Println("Do I get here?")

	err := http.ListenAndServeTLS(":443", "cert.pem", "key.pem", nil)
	if err != nil {
		log.Fatal("ListenAndServ: ", err)
	}
}
