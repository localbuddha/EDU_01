package edu17;


import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MyServer {
    public static void main(String[] args) throws IOException {
        HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
        server.createContext("/hello", request -> {
            System.out.println("Request from: ' " + request.getRemoteAddress() + "'");
            request.sendResponseHeaders(200, -1);
            request.getResponseBody().write("Hello, World!".getBytes());
            request.getResponseBody().close();
        });
        server.start();
    }
}