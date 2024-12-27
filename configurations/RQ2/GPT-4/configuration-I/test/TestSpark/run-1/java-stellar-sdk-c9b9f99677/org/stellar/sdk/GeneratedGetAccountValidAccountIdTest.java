package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetAccountValidAccountIdTest {

    @Test
    public void getAccountValidAccountIdTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        // setup accountId
        String accountId = "account123";
        // assuming that the accountId is valid
        TransactionBuilderAccount result = server.getAccount(accountId);
        Assert.assertNotNull(result);
    }

}