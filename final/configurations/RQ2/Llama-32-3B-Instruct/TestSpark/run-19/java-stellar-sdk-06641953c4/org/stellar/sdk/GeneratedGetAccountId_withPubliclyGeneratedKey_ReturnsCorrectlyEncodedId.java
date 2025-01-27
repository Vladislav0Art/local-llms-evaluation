package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetAccountId_withPubliclyGeneratedKey_ReturnsCorrectlyEncodedId {

    @Test
    public void getAccountId_withPubliclyGeneratedKey_ReturnsCorrectlyEncodedId() {
        // Arrange
        EdDSAPublicKey publicKey = KeyPairGenerator.generate();

        // Act and Assert
        assertEquals(publicKey.encode(), new KeyPair(publicKey).getAccountId());
    }

}