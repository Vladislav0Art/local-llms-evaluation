package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromSecretSeedByteShouldReturnKeyPair {

    @Test
    public void fromSecretSeedByteShouldReturnKeyPair() {
        char[] seed = Mockito.mock(char[].class);
        byte[] expectedSeed = new byte[]{1, 2, 3};
        when(seed).length().thenReturn(expectedSeed.length);
        assertEquals(KeyPair.fromSecretSeed(seed), new KeyPair(expectedSeed));
    }

}