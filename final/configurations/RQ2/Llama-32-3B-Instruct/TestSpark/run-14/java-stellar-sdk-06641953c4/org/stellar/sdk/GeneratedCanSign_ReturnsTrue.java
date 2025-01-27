package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCanSign_ReturnsTrue {

    @Test
    public void canSign_ReturnsTrue() {
        // Arrange
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());

        // Act
        boolean result = keyPair.canSign();

        // Assert
        assertTrue(result);
    }

}