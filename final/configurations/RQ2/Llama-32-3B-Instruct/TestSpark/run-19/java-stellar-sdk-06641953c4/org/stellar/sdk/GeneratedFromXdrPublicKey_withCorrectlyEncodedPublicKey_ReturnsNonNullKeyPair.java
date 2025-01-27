package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_withCorrectlyEncodedPublicKey_ReturnsNonNullKeyPair {

    @Test
    public void fromXdrPublicKey_withCorrectlyEncodedPublicKey_ReturnsNonNullKeyPair() {
        // Arrange
        byte[] publicKey = PublicKey.encode(KeyPairGenerator.generate());

        // Act and Assert
        assertNotEquals(null, KeyPair.fromXdrPublicKey(PublicKey.decode(publicKey)));
    }

}