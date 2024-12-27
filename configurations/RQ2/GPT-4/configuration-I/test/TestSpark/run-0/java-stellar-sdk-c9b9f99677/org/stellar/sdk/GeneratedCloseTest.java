package org.stellar.sdk;

import org.junit.Test;
import org.mockito.junit.MockitoJUnitRunner;
import org.junit.runner.RunWith;

import static org.mockito.Mockito.*;

import java.io.IOException;

import org.stellar.sdk.Transaction;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.mockito.runners.MockitoJUnitRunner;
import org.stellar.sdk.responses.AccountNotFoundException;
import org.stellar.sdk.responses.SorobanRpcErrorResponse;

import java.util.Collections;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCloseTest {

    private SorobanServer server = mock(SorobanServer.class);

    @Test
    public void closeTest() throws IOException {
        doNothing().when(server).close();
        server.close();
        verify(server).close();
    }

}