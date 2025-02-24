package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedSignTest {

    private final EdDSAPublicKey publicKey = new EdDSAPublicKey();
    private final EdDSAPrivateKey privateKey = new EdDSAPrivateKey();

    @Test
    public void signTest() {
        KeyPair keyPair = new KeyPair(privateKey);
        byte[] data = "test".getBytes();
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}