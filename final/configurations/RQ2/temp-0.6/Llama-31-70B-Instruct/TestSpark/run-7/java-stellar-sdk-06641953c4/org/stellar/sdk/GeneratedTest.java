package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        boolean value = keyPair.canSign();

        // Assert
        assertEquals(false, value);
    }

    @Test
    public void getAccountIdTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        String value = keyPair.getAccountId();

        // Assert
        assertEquals("", value);
    }

    @Test
    public void getSecretSeedTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        char[] value = keyPair.getSecretSeed();

        // Assert
        assertEquals(0, value.length);
    }

    @Test
    public void getPublicKeyTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        byte[] value = keyPair.getPublicKey();

        // Assert
        assertEquals(0, value.length);
    }

    @Test
    public void getXdrPublicKeyTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        PublicKey value = keyPair.getXdrPublicKey();

        // Assert
        assertEquals(0, value.getEd25519().length);
    }

}