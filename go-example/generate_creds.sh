#!/bin/bash

echo "hello world"

if [ "$#" -ne 1 ]; then
    echo "Please enter the server's IP address"
fi

echo "Using IP $1"

go run /usr/share/go/src/crypto/tls/generate_cert.go -ca -host $1