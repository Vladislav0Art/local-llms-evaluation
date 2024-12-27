package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedGetAccountSorobanRpcErrorResponseTest {

    @Test
    public void getAccountSorobanRpcErrorResponseTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String accountId = "rpcerroraccount";
        server.getAccount(accountId);
    }

}