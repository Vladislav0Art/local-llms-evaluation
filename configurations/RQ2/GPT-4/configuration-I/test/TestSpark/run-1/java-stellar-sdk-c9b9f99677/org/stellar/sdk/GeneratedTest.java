package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void getAccountTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String accountId = "account123";
        TransactionBuilderAccount account = server.getAccount(accountId);
        Assert.assertNotNull(account);
    }

    @Test
    public void getAccountNotFoundExceptionTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String accountId = "invalidaccount";
        server.getAccount(accountId);
    }

    @Test
    public void getAccountIOExceptionTest() throws Exception {
        SorobanServer server = new SorobanServer("http://invalidurl");
        String accountId = "account123";
        server.getAccount(accountId);
    }

    @Test
    public void getAccountSorobanRpcErrorResponseTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        String accountId = "rpcerroraccount";
        server.getAccount(accountId);
    }

    @Test
    public void closeTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        server.close();
    }

}