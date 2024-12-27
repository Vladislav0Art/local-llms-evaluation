package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetNetworkValidServerTest {

    @Test
    public void getNetworkValidServerTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        GetNetworkResponse response = server.getNetwork();
        Assert.assertNotNull(response);
    }

}