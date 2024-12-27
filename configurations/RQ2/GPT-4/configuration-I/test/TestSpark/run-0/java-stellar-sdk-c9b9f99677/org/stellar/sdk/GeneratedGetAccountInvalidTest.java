package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.stellar.sdk.responses.AccountNotFoundException;
import org.stellar.sdk.responses.SorobanRpcErrorResponse;

import java.io.IOException;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetAccountInvalidTest {

    SorobanServer server = mock(SorobanServer.class);

    @Test
    public void getAccountInvalidTest() throws IOException, AccountNotFoundException, SorobanRpcErrorResponse {
        assertNotNull(server.getAccount("InvalidAccountId"));
    }

}