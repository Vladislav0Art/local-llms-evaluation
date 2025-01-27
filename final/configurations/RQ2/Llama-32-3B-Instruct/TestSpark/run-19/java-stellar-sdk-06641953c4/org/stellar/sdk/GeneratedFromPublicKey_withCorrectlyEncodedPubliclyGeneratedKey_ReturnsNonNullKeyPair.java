package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromPublicKey_withCorrectlyEncodedPubliclyGeneratedKey_ReturnsNonNullKeyPair {

    @Test
    public void fromPublicKey_withCorrectlyEncodedPubliclyGeneratedKey_ReturnsNonNullKeyPair() {
        // Arrange
        byte[] publicKey = EdDSAPublicKey.encode(KeyPairGenerator.generate());

        // Act and Assert
        assertNotEquals(null, KeyPair.fromPublicKey(publicKey));
    }

}