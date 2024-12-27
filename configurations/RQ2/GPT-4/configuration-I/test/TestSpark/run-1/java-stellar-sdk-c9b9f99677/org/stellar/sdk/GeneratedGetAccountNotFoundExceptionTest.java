package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedGetAccountNotFoundExceptionTest {

    @Test
    public void getAccountNotFoundExceptionTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String accountId = "invalidaccount";
        server.getAccount(accountId);
    }

}