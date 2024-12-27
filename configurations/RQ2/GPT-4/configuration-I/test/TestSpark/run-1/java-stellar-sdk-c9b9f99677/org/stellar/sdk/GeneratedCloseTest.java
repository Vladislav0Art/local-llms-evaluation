package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class GeneratedCloseTest {

    @Test
    public void closeTest() throws Exception {
        SorobanServer server = new SorobanServer("http://localhost:1234");
        server.close();
    }

}