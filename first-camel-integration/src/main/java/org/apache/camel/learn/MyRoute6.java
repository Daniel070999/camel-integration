package org.apache.camel.learn;

import org.apache.camel.builder.RouteBuilder;

public class MyRoute6 extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("file:src/datos?noop=True&fileName=personas.csv")
                .pipeline()
                .bean("myBeanMask","masking")
                .log("Contenido ${body}")
                .to("mock:end");
    }
}
