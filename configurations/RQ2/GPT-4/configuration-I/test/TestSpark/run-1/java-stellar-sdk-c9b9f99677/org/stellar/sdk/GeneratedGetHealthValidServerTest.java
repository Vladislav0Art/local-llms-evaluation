package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetHealthValidServerTest {

    @Test
    public void getHealthValidServerTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        GetHealthResponse response = server.getHealth();
        Assert.assertNotNull(response);
    }

}