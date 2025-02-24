package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        char[] value = keyPair.getSecretSeed();

        // Assert
        assertEquals(0, value.length);
    }

}