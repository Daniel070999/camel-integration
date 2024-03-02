package org.apache.camel.learn;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class SaludosTest extends CamelTestSupport {

    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new MyRoute1();
    }

    @Test
    public void testSaludos() throws InterruptedException {
        System.out.println("############## Enviar mensaje por el canal directo");
        template.sendBody("direct:inicio", "Hola mundo");
        System.out.println("############## Enviar otro mensjae por el canal directo");
        template.sendBody("direct:inicio", "Adios");
    }

}
