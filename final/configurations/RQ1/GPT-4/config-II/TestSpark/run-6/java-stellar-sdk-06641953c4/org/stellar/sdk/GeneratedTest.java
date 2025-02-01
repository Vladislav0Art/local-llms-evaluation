package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void KeyPairPublicKeyTest() {
        // Create public key and KeyPair
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey);

        // Verify key pair
        assertEquals(publicKey, keyPair.mPublicKey);
        assertFalse(keyPair.canSign());
    }

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

    @Test
    public void fromAccountIdInvalidTest() {
        KeyPair.fromAccountId("invalid");
    }

    @Test
    public void fromSecretSeedInvalidTest() {
        KeyPair.fromSecretSeed("invalid".toCharArray());
    }

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals("GAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAWHF", keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        assertEquals("SAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAZ", new String(keyPair.getSecretSeed()));
    }

    @Test
    public void getPublicKeyTest() {
        byte[] publicKeyBytes = new byte[32];
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKeyBytes, KeyPair.ed25519));
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKeyBytes, keyPair.getPublicKey());
    }

    @Test
    public void hashCodeTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(publicKey);
        assertEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

    @Test
    public void equalsTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], KeyPair.ed25519));
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(publicKey);
        assertEquals(keyPair1, keyPair2);
    }

}