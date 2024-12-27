package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

public class GeneratedCloseServerTest {

    @Test
    public void closeServerTest() throws Exception {
        OkHttpClient mockedClient = mock(OkHttpClient.class);
        SorobanServer server = new SorobanServer("http://localhost:1234", mockedClient);
        server.close();
        verify(mockedClient).dispatcher().executorService().shutdown();
    }

}