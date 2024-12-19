package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromSecretSeedByteArray {

    @Test
    public void testFromSecretSeedByteArray() {
        byte[] seed = "some-secret-seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
        assertNotNull(keyPair.getSecretSeed());
    }

}