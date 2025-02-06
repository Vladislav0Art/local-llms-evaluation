package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetSecretSeed_returnsSecretSeed {

    @Test
    public void getSecretSeed_returnsSecretSeed() {
        char[] secretSeed = "secret".toCharArray();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretKeySpec(secretSeed));
        assertNotNull(keyPair.getSecretSeed());
    }

}