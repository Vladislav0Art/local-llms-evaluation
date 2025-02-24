package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.getSecretSeed()).thenReturn("test".toCharArray());
        assertArrayEquals("test".toCharArray(), keyPair.getSecretSeed());
    }

}