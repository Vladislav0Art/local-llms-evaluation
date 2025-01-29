package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestFromXdrPrivateKeyBytes {

    @Test
    public void testFromXdrPrivateKeyBytes() {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPrivateKey = KeyPair.fromXdrPrivateKey(privateKey);
        assertEquals(privateKeySpec, fromXdrPrivateKey);
    }

}