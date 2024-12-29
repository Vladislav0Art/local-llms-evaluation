package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGeneratePublicKeyTest {

    private String generatePrivateKey() {
        return "private key";
    }

    private String generatePublicKey() {
        return "public key";
    }

    @Test
    public void generatePublicKeyTest() {
        assertEquals("public key", PrivateKeyGenerator.generatePublicKey());
    }

}