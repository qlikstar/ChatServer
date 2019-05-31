# ChatServer
Websocket Chat Webserver using Spring Boot with STOMP protocol

# Instructions to run
- Install maven and run 
```
$ mvn spring-boot:run
```
- This will run the chat server on port 9090

- Now run the chat UI server. The chat UI server will connect to the Chat Webserver using port 9090.

- Clone the Chat UI server from : https://github.com/qlikstar/chat-server-ui

- Follow the instructions in the readme file to install and run the Chat UI server.

- Finally open http://localhost:8080 and start playing