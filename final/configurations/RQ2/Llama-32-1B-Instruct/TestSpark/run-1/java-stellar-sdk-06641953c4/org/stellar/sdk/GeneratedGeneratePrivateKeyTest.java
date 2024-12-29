package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGeneratePrivateKeyTest {

    private String generatePrivateKey() {
        return "private key";
    }

    private String generatePublicKey() {
        return "public key";
    }

    @Test
    public void generatePrivateKeyTest() {
        assertEquals("private key", PrivateKeyGenerator.generatePrivateKey());
    }

}