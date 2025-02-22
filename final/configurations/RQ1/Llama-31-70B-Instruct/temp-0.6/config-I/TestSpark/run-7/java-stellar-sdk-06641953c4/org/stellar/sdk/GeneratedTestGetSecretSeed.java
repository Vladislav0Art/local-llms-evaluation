package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        KeyPair keyPair = new KeyPair();
        char[] secretSeed = keyPair.getSecretSeed();
        assertEquals("expected secretSeed", secretSeed);
    }

}