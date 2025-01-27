package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGenerate_WithCorrectSeedTest {

    @Test
    public void generate_WithCorrectSeedTest() {
        byte[] seed = "1234567890".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}