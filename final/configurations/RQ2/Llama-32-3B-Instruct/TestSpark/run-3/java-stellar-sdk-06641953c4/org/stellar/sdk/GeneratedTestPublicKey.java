package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class GeneratedTestPublicKey {

    @Test
    public void testPublicKey() {
        assertDoesNotThrow(() -> {
            EdDSAPublicKey publicKey = new EdDSAPublicKey();
            // Use the publicKey object as needed
        });
    }

}