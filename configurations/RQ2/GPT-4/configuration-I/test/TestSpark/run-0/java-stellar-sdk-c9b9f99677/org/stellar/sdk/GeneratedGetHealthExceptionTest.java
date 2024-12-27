package org.stellar.sdk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.Transaction;

import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.mockito.runners.MockitoJUnitRunner;
import org.stellar.sdk.responses.AccountNotFoundException;
import org.stellar.sdk.responses.SorobanRpcErrorResponse;

import java.util.Collections;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedGetHealthExceptionTest {

    private SorobanServer server = mock(SorobanServer.class);

    @Test
    public void getHealthExceptionTest() throws IOException {
        server.getHealth();
    }

}