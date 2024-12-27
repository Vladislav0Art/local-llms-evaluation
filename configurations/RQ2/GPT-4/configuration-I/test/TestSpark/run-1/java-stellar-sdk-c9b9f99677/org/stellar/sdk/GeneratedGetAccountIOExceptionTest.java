package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedGetAccountIOExceptionTest {

    @Test
    public void getAccountIOExceptionTest() throws Exception {
        SorobanServer server = new SorobanServer("http://invalidurl");
        String accountId = "account123";
        server.getAccount(accountId);
    }

}