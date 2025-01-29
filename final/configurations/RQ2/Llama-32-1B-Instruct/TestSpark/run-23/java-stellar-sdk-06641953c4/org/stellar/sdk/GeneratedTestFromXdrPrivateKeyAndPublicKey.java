package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestFromXdrPrivateKeyAndPublicKey {

    @Test
    public void testFromXdrPrivateKeyAndPublicKey() {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPrivateKeyAndPublicKey = KeyPair.fromXdrPrivateKey(bytes);
        assertEquals(privateKeySpec, fromXdrPrivateKeyAndPublicKey);
    }

}