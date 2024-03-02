package org.apache.camel.learn;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.support.DefaultRegistry;

/**
 * A Camel Application
 */
public class MainApp2 {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
        DefaultRegistry registry = new DefaultRegistry();
        registry.bind("myBeanMask", new Mask());
        CamelContext context = new DefaultCamelContext(registry);
        context.addRoutes(new MyRoute6());
        context.start();
        Thread.sleep(5000);
        context.stop();
    }
}

