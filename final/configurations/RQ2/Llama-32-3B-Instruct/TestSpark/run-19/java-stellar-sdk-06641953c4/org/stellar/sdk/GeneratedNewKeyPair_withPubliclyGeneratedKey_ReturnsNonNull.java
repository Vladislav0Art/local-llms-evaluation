package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedNewKeyPair_withPubliclyGeneratedKey_ReturnsNonNull {

    @Test
    public void newKeyPair_withPubliclyGeneratedKey_ReturnsNonNull() {
        // Arrange
        EdDSAPublicKey publicKey = KeyPairGenerator.generate();

        // Act
        KeyPair keyPair = new KeyPair(publicKey);

        // Assert
        assertNotNull(keyPair);
    }

}