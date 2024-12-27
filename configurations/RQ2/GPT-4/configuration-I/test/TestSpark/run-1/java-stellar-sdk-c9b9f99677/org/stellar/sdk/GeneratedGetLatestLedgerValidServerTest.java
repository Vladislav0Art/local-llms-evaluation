package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetLatestLedgerValidServerTest {

    @Test
    public void getLatestLedgerValidServerTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        GetLatestLedgerResponse response = server.getLatestLedger();
        Assert.assertNotNull(response);
    }

}