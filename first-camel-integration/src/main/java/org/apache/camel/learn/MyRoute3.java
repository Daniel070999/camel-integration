package org.apache.camel.learn;

import org.apache.camel.builder.RouteBuilder;

public class MyRoute3 extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:iniciaSaludo")
                .log("Mensaje de entrada ${body}")
                .choice()
                .when().simple("${body} contains 'Mundo'")
                    .log("El saludo si contiene la cadena de caracteres Mundo")
                .otherwise()
                    .log("El saludo no contiene el patrón")
                .end()
                .to("direct:finalzaSaludo");

                from("direct:finalzaSaludo").to("log:FIN");
    }
}
