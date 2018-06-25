package com.byhovsky.soap1;

import javax.xml.ws.Endpoint;

public class HelloWebServicePublisher {
    public static void main(String... args) {
        Endpoint.publish("http://localhost:1986/wss/hello", new HelloWebServiceImpl());
    }
}

