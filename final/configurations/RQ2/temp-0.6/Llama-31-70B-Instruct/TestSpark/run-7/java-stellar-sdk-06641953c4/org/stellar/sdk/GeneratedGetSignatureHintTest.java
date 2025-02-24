package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        SignatureHint value = keyPair.getSignatureHint();

        // Assert
        assertEquals(0, value.getHint().length);
    }

}