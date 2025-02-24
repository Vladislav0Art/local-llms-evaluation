package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAccountIdTest {

    private final EdDSAPublicKey publicKey = new EdDSAPublicKey();
    private final EdDSAPrivateKey privateKey = new EdDSAPrivateKey();

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair.getAccountId());
    }

}