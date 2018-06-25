package com.byhovsky.soap1;

import javax.jws.WebService;

@WebService(endpointInterface = "com.byhovsky.soap1.HelloWebService")
public class HelloWebServiceImpl implements HelloWebService {

    @Override
    public String getHelloString(String id) {
        return id;
    }
}


