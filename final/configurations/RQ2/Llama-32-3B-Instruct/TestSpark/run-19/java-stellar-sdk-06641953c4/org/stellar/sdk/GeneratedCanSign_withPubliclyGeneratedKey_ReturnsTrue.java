package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedCanSign_withPubliclyGeneratedKey_ReturnsTrue {

    @Test
    public void canSign_withPubliclyGeneratedKey_ReturnsTrue() throws GeneralSecurityException {
        // Arrange
        EdDSAPublicKey publicKey = KeyPairGenerator.generate();

        // Act and Assert
        assertTrue(new KeyPair(publicKey).canSign());
    }

}