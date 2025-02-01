package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedKeyPairPublicKeyPrivateKeyTest {

    @Test
    public void KeyPairPublicKeyPrivateKeyTest() {
        // Create public key, private key and KeyPair
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[64], KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey, privateKey);

        // Verify key pair
        assertEquals(publicKey, keyPair.mPublicKey);
        assertEquals(privateKey, keyPair.mPrivateKey);
        assertTrue(keyPair.canSign());
    }

}