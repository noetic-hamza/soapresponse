package com.example.demo.client;


import com.ericsson.schemas.Acknowledgment;
import com.ericsson.schemas.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

@Service
public class soapClient {
    @Autowired
    private Jaxb2Marshaller marshaller;

    private WebServiceTemplate template;

    public Acknowledgment getResponse(UserRequest request){
        template= new WebServiceTemplate(marshaller);
        Acknowledgment acknowledgment= (Acknowledgment) template.marshalSendAndReceive("http://localhost:8080/ws",request);
        return  acknowledgment;


    }

}
