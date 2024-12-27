package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetTransactionValidHashTest {

    @Test
    public void getTransactionValidHashTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String hash = "hash123"; // assuming valid hash
        GetTransactionResponse response = server.getTransaction(hash);
        Assert.assertNotNull(response);
    }

}