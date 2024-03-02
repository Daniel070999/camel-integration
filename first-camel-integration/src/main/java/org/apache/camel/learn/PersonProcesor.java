package org.apache.camel.learn;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;

public class PersonProcesor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        ArrayList<Persona> lista = (ArrayList) exchange.getIn().getBody();
        for(Persona persona : lista){
            System.out.println("########## Process "+persona.toString());
        }
    }
}
