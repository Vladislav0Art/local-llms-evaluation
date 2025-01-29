package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestFromXdrPublicKeyAndPrivateKey {

    @Test
    public void testFromXdrPublicKeyAndPrivateKey() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPublicKeyAndPrivateKey = KeyPair.fromXdrPublicKey(bytes);
        assertEquals(publicKey, fromXdrPublicKeyAndPrivateKey);
    }

}