package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromSecretSeedString {

    @Test
    public void testFromSecretSeedString() {
        String seed = "some-secret-seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
        assertNotNull(keyPair.getSecretSeed());
    }

}