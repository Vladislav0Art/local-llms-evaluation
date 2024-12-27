package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedPrepareTransactionValidTransactionTest {

    @Test
    public void prepareTransactionValidTransactionTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        Transaction transaction = new Transaction();
        Transaction response = server.prepareTransaction(transaction);
        Assert.assertNotNull(response);
    }

}