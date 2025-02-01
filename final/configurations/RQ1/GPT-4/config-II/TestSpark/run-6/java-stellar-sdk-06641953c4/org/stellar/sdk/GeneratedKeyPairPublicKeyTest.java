package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedKeyPairPublicKeyTest {

    @Test
    public void KeyPairPublicKeyTest() {
        // Create public key and KeyPair
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey);

        // Verify key pair
        assertEquals(publicKey, keyPair.mPublicKey);
        assertFalse(keyPair.canSign());
    }

}