package main

import (
	"encoding/json"
	"fmt"
	"log"
	"net/http"
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

func main() {
	fmt.Println("Hello world!")

	// setup the server
	http.HandleFunc("/login", func(response http.ResponseWriter, request *http.Request) {
		var creds Credentials

		err := json.NewDecoder(request.Body).Decode(&creds)
		if err != nil {
			http.Error(response, err.Error(), http.StatusBadRequest)
			return
		}

		fmt.Println("Received a login request from", creds.Username, "with password:", creds.Password)
		response.Header().Set("Content-Type", "application/json")
		// response.WriteHeader(http.StatusOK)

		loginResult, _ := json.Marshal(LoginResult{Success: true, Message: fmt.Sprintf("Hello %s", creds.Username)})

		fmt.Fprintf(response, string(loginResult))
		// response.Write(json.Marshal(res_value))
	})

	err := http.ListenAndServeTLS(":443", "cert.pem", "key.pem", nil)
	if err != nil {
		log.Fatal("ListenAndServ: ", err)
	}
}
