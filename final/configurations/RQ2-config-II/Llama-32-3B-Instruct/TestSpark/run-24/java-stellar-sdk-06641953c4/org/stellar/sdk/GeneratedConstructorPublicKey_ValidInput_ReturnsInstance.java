package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConstructorPublicKey_ValidInput_ReturnsInstance {

    @Test
    public void constructorPublicKey_ValidInput_ReturnsInstance() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}