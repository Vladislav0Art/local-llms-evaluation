package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetSecretSeed_ReturnsCorrectSecretSeed {

    @Test
    public void getSecretSeed_ReturnsCorrectSecretSeed() {
        char[] seed = "1234567890".toCharArray();
        KeyPair keyPair = new KeyPair(seed);
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

}