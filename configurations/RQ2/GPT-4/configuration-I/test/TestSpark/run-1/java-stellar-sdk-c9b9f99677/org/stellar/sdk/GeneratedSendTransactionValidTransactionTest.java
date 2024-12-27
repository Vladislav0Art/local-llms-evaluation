package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedSendTransactionValidTransactionTest {

    @Test
    public void sendTransactionValidTransactionTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        Transaction transaction = new Transaction();
        SendTransactionResponse response = server.sendTransaction(transaction);
        Assert.assertNotNull(response);
    }

}