package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedGetAccountTest {

    @Test
    public void getAccountTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String accountId = "account123";
        TransactionBuilderAccount account = server.getAccount(accountId);
        Assert.assertNotNull(account);
    }

}