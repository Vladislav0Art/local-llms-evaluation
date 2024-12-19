package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        char[] seed = "some-secret-seed".toCharArray();
        KeyPair keyPair = new KeyPair(KeyPair.fromSecretSeed(seed));
        assertNotNull(keyPair);
        assertEquals(EdDSAPublicKey.class, keyPair.getPublicKey().getClass());
        assertNotNull(keyPair.getSecretSeed());
    }

}