package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetSecretSeed_SmallSecretSeed {

    @Test
    public void testGetSecretSeed_SmallSecretSeed() {
        char[] smallSecretSeed = "small_secret_seed".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("eddsa_key"));
        assertEquals(smallSecretSeed, keyPair.getSecretSeed());
    }

}