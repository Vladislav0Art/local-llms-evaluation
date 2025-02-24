package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = new KeyPair(null);
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);
    }

}