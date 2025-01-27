package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedTest {

    @Test
    public void random_ReturnsValidKeyPair() throws Exception {
        // Arrange and Act
        KeyPair keyPair = KeyPair.random();

        // Assert
        assertNotNull(keyPair);
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void fromSecretSeed_WithByteArraySeed_ReturnsValidKeyPair() throws Exception {
        // Arrange
        byte[] seed = "secretpassword".getBytes();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Act and Assert
        assertTrue(KeyPair.fromSecretSeed(seed).getPublicKey() != null);
    }

    @Test
    public void random_ReturnsValidKeyPair() throws Exception {
        // Act and Assert
        assertTrue(KeyPair.random().getPublicKey() != null);
    }

}