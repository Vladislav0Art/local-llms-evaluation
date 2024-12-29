package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEncodeEncodedPrivateKey {

    @Test
    public void encodeEncodedPrivateKey() {
        String encodedPrivateKey = PrivateKeyGenerator.encodeEncodedPrivateKey(PrivateKeyGenerator.encodePrivateKey(PrivateKeyGenerator.generatePublicKey()));
        assertEquals("encoded public key and private key", encodedPrivateKey);
    }

}