package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        byte[] value = keyPair.getPublicKey();

        // Assert
        assertEquals(0, value.length);
    }

}