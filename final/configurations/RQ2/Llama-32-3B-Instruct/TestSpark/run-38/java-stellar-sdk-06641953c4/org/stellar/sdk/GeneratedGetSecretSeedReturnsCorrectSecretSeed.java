package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetSecretSeedReturnsCorrectSecretSeed {

    @Test
    public void getSecretSeedReturnsCorrectSecretSeed() {
        char[] seed = createCharArray("1234567890");
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

}