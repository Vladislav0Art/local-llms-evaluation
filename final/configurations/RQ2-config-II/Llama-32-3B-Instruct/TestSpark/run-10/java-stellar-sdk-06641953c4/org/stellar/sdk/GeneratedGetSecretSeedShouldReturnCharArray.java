package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetSecretSeedShouldReturnCharArray {

    @Test
    public void getSecretSeedShouldReturnCharArray() {
        byte[] expectedSeed = new byte[]{1, 2, 3};
        when(new KeyPair(expectedSeed)).getSecretSeed().thenReturn(expectedSeed);
        assertEquals(expectedSeed, new KeyPair(expectedSeed).getSecretSeed());
    }

}