package org.apache.camel.learn;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

public class RouteInLineTest extends CamelTestSupport {
    @Override
    protected RoutesBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").to("log:fin");
            }
        };
    }

    @Test
    public void enviarMensajeTest() throws InterruptedException {
        template.sendBody("direct:start", "Mensaje enviado a route inline");
    }
}
