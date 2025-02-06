package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = Mockito.mock(KeyPair.class);
        when(keyPair.getSecretSeed()).thenReturn("1234567890".getBytes());
        assertArrayEquals("1234567890".getBytes(), keyPair.getSecretSeed());
    }

}