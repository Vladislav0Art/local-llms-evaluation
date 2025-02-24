package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.stellar.sdk.KeyPair;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.getByName("ed25519"))));
        boolean expected = true;

        // Act
        boolean actual = keyPair.canSign();

        // Assert
        assertEquals(expected, actual);
    }

}