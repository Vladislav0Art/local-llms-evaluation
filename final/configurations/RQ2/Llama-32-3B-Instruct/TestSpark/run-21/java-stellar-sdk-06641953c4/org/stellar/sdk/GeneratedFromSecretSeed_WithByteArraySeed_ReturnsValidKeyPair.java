package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedFromSecretSeed_WithByteArraySeed_ReturnsValidKeyPair {

    @Test
    public void fromSecretSeed_WithByteArraySeed_ReturnsValidKeyPair() throws Exception {
        // Arrange
        byte[] seed = "secretpassword".getBytes();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        // Act and Assert
        assertTrue(KeyPair.fromSecretSeed(seed).getPublicKey());
    }

}