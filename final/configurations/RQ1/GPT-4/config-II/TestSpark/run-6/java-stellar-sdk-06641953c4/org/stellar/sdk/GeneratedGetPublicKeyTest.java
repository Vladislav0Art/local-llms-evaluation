package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        byte[] publicKeyBytes = new byte[32];
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKeyBytes, KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKeyBytes, keyPair.getPublicKey());
    }

}