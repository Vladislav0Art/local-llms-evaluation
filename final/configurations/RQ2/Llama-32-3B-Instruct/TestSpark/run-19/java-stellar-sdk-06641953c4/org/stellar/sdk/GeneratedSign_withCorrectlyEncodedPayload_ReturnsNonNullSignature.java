package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSign_withCorrectlyEncodedPayload_ReturnsNonNullSignature {

    @Test
    public void sign_withCorrectlyEncodedPayload_ReturnsNonNullSignature() throws GeneralSecurityException {
        // Arrange
        byte[] data = "Hello, world!".getBytes();

        // Act and Assert
        assertNotNull(new KeyPair(KeyPairGenerator.generate()).sign(data));
    }

}