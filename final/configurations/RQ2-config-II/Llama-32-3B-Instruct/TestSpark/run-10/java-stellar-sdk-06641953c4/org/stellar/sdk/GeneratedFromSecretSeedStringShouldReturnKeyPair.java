package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromSecretSeedStringShouldReturnKeyPair {

    @Test
    public void fromSecretSeedStringShouldReturnKeyPair() {
        String seed = Mockito.mock(String.class);
        byte[] expectedSeed = "test".getBytes();
        when(seed).getBytes().thenReturn(expectedSeed);
        assertEquals(KeyPair.fromSecretSeed(seed), new KeyPair(expectedSeed));
    }

}