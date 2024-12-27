package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedSimulateTransactionValidTransactionTest {

    @Test
    public void simulateTransactionValidTransactionTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        Transaction transaction = new Transaction();
        SimulateTransactionResponse response = server.simulateTransaction(transaction);
        Assert.assertNotNull(response);
    }

}