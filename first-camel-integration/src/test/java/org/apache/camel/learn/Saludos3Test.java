package org.apache.camel.learn;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class Saludos3Test extends CamelTestSupport {
    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new MyRoute3();
    }

    @Test
    public void enaviarMensajes(){
        template.sendBody("direct:iniciaSaludo", "Hola");
        template.sendBody("direct:iniciaSaludo", "Buenos días");
        template.sendBody("direct:iniciaSaludo", "Hola Mundo");
        template.sendBody("direct:iniciaSaludo", "Chao");
    }
}
