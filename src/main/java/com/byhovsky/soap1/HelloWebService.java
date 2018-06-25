package com.byhovsky.soap1;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@SOAPBinding(style = SOAPBinding.Style.RPC)
@WebService
public interface HelloWebService {
    @WebMethod
    public String getHelloString(String id);
}
