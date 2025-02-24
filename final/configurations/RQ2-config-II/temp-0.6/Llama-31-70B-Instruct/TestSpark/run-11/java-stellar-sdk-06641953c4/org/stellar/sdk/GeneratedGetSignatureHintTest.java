package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetSignatureHintTest {

    private final EdDSAPublicKey publicKey = new EdDSAPublicKey();
    private final EdDSAPrivateKey privateKey = new EdDSAPrivateKey();

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair.getSignatureHint());
    }

}