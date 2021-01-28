package org.acme.getting.started;

import io.quarkus.test.junit.QuarkusTest;
import org.jboss.logging.Logger;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class GreetingResourceTest {
    static Logger LOG = Logger.getLogger(GreetingResourceTest.class);

    @Test
    public void testHelloEndpoint() {
        LOG.error("Boris najdi me.");
    }
}
