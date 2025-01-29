package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        String secretSeed = EdDSAPublicKeyGenerator.generateSecretSeed();
        assertTrue(secretSeed.length() == 8); // assuming the length of the string is fixed to 8 characters
    }

}