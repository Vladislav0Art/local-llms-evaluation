package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCanSignTest {

    private final EdDSAPublicKey publicKey = new EdDSAPublicKey();
    private final EdDSAPrivateKey privateKey = new EdDSAPrivateKey();

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());
    }

}