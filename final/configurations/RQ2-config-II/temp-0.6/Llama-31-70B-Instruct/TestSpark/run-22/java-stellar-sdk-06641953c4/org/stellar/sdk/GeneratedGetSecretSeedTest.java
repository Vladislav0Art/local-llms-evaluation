package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals("expectedSeed", String.valueOf(keyPair.getSecretSeed()));
    }

}