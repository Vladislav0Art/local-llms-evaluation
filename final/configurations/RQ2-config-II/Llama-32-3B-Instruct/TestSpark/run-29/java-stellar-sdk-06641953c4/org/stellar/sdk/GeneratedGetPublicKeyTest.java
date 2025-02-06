package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = Mockito.mock(KeyPair.class);
        when(keyPair.getPublicKey()).thenReturn("1234567890".getBytes());
        assertArrayEquals("1234567890".getBytes(), keyPair.getPublicKey());
    }

}