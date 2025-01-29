package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestFromXdrPublicKeyBytes {

    @Test
    public void testFromXdrPublicKeyBytes() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPublicKey = KeyPair.fromXdrPublicKey(bytes);
        assertEquals(publicKey, fromXdrPublicKey);
    }

}