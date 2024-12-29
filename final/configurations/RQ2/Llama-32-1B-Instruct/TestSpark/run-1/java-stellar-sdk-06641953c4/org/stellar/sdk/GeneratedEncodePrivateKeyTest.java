package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEncodePrivateKeyTest {

    private String generatePrivateKey() {
        return "private key";
    }

    private String generatePublicKey() {
        return "public key";
    }

    @Test
    public void encodePrivateKeyTest() {
        String privateKey = "private key";
        byte[] encodedPrivateKey = (byte[]) PrivateKeyGenerator.encodePrivateKey(privateKey);
        assertEquals("encoded private key", new String(encodedPrivateKey));
    }

}