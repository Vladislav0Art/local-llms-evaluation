package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTestFromXdrKeySpec {

    @Test
    public void testFromXdrKeySpec() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrKeySpec = KeyPair.fromXdrKeySpec(bytes);
        assertEquals(publicKeySpec, fromXdrKeySpec);
    }

}