package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeed_WorksCorrectly {

    @Test
    public void getSecretSeed_WorksCorrectly() {
        // Arrange
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());

        // Act and Assert
        char[] secretSeed = keyPair.getSecretSeed();
        assertNotNull(secretSeed);

        assertEquals(16, secretSeed.length);
    }

}