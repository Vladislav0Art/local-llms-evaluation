package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedGenerateEncodedPrivateKey {

    @Test
    public void generateEncodedPrivateKey() {
        byte[] encodedPrivateKey = PrivateKeyGenerator.encodePrivateKey(PrivateKeyGenerator.generatePrivateKey());
        assertEquals("encoded private key", encodedPrivateKey.toString());
    }

}