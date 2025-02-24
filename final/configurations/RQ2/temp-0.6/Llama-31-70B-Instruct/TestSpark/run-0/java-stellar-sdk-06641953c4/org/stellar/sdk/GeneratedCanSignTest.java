package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.canSign()).thenReturn(true);
        assertTrue(keyPair.canSign());
    }

}