package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.getPublicKey()).thenReturn("test".getBytes());
        assertArrayEquals("test".getBytes(), keyPair.getPublicKey());
    }

}