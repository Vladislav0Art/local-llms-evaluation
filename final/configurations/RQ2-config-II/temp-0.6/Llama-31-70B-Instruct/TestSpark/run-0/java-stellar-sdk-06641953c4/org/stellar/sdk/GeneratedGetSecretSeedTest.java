package org.stellar.sdk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = new KeyPair(/* some public key */);
        assertEquals("expected secret seed", keyPair.getSecretSeed());
    }

}