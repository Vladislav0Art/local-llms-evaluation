package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerify_withCorrectlyDecodedSignature_ReturnsTrue {

    @Test
    public void verify_withCorrectlyDecodedSignature_ReturnsTrue() throws GeneralSecurityException {
        // Arrange
        byte[] signature = new byte[]{0x01};
        byte[] data = "Hello, world!".getBytes();

        // Act and Assert
        assertTrue(new KeyPair(KeyPairGenerator.generate()).verify(data, signature));
    }

}