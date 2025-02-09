package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCanSignWithValidSecretSeed {

    @Test
    public void canSignWithValidSecretSeed() {
        char[] seed = createCharArray("1234567890");
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair.canSign());
    }

}