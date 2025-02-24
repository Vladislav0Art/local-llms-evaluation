package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetXdrPublicKeyTest {

    private final EdDSAPublicKey publicKey = new EdDSAPublicKey();
    private final EdDSAPrivateKey privateKey = new EdDSAPrivateKey();

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair.getXdrPublicKey());
    }

}