package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        PublicKey value = keyPair.getXdrPublicKey();

        // Assert
        assertEquals(0, value.getEd25519().length);
    }

}