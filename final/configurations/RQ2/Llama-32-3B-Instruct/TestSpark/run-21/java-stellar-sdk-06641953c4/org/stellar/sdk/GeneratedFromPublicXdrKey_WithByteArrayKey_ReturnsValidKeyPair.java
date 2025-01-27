package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

public class GeneratedFromPublicXdrKey_WithByteArrayKey_ReturnsValidKeyPair {

    @Test
    public void fromPublicXdrKey_WithByteArrayKey_ReturnsValidKeyPair() {
        // Arrange
        byte[] publicKey = "publickey".getBytes();

        // Act and Assert
        assertTrue(KeyPair.fromXdrPublicKey(PublicKey.of(publicKey)).getPublicKey());
    }

}