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
public class GeneratedGetTransactionInvalidTest {

    SorobanServer server = mock(SorobanServer.class);

    @Test
    public void getTransactionInvalidTest() throws IOException, SorobanRpcErrorResponse {
        assertNotNull(server.getTransaction("invalidHash"));
    }

}