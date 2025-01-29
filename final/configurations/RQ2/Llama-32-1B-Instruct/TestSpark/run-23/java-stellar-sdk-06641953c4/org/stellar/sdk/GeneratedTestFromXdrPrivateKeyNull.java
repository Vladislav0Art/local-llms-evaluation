package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestFromXdrPrivateKeyNull {

    @Test
    public void testFromXdrPrivateKeyNull() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] privateKey = null;
        KeyPair fromXdrPrivateKey = KeyPair.fromXdrPrivateKey(publicKey, privateKey);
        assertEquals(null, fromXdrPrivateKey);
    }

}