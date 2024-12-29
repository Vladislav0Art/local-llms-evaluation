package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEncodeEncodedPrivateKeyTest {

    private String generatePrivateKey() {
        return "private key";
    }

    private String generatePublicKey() {
        return "public key";
    }

    @Test
    public void encodeEncodedPrivateKeyTest() {
        String publicKey = "public key";
        String privateKey = "private key";
        String encodedPrivateKey = PrivateKeyGenerator.encodeEncodedPrivateKey(publicKey, privateKey);
        assertEquals("encoded public key and private key", encodedPrivateKey);
    }

}