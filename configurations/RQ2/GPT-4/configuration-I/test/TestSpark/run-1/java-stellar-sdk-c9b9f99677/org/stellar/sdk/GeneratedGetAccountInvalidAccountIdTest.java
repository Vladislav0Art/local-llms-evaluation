package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedGetAccountInvalidAccountIdTest {

    @Test
    public void getAccountInvalidAccountIdTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        // setup invalid accountId
        String accountId = "invalidaccount";
        server.getAccount(accountId);
    }

}