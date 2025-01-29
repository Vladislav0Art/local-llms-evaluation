package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest {

    @Test
    public void testGeneratePublicKey() {
        byte[] publicKey = generatePublicKey();
        EdDSAPublicKey fromXdrPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(new byte[]{1, 2, 3, 4}, fromXdrPublicKey.publicKeyBytes());
        assertNotEquals(null, fromXdrPublicKey);
    }

    public static byte[] generatePublicKey() {
        return new byte[]{1, 2, 3, 4};
    }

    @Test
    public void testFromXdrPublicKeyNull() {
        byte[] publicKey = null;
        KeyPair fromXdrPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(null, fromXdrPublicKey);
    }

    @Test
    public void testFromXdrPrivateKeyNull() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] privateKey = null;
        KeyPair fromXdrPrivateKey = KeyPair.fromXdrPrivateKey(publicKey, privateKey);
        assertEquals(null, fromXdrPrivateKey);
    }

    @Test
    public void testFromXdrPublicKeyBytes() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPublicKey = KeyPair.fromXdrPublicKey(bytes);
        assertEquals(publicKey, fromXdrPublicKey);
    }

    @Test
    public void testFromXdrPrivateKeyBytes() {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPrivateKey = KeyPair.fromXdrPrivateKey(privateKey);
        assertEquals(privateKeySpec, fromXdrPrivateKey);
    }

    @Test
    public void testFromXdrPublicKeyAndPrivateKey() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPublicKeyAndPrivateKey = KeyPair.fromXdrPublicKey(bytes);
        assertEquals(publicKey, fromXdrPublicKeyAndPrivateKey);
    }

    @Test
    public void testFromXdrPrivateKeyAndPublicKey() {
        EdDSAPrivateKey privateKey = new EdDSAPrivateKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrPrivateKeyAndPublicKey = KeyPair.fromXdrPrivateKey(bytes);
        assertEquals(privateKeySpec, fromXdrPrivateKeyAndPublicKey);
    }

    @Test
    public void testFromXdrKeySpec() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        byte[] bytes = {1, 2, 3, 4};
        KeyPair fromXdrKeySpec = KeyPair.fromXdrKeySpec(bytes);
        assertEquals(publicKeySpec, fromXdrKeySpec);
    }

}