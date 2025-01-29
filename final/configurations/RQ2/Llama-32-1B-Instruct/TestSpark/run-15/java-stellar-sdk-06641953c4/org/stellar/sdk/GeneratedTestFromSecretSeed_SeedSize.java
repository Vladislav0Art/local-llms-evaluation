package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromSecretSeed_SeedSize {

    @Test
    public void testFromSecretSeed_SeedSize() {
        char[] seed = "secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNull(keyPair.getSecretSeed());
        assertNotNull(keyPair.getPublicKey());
    }

}