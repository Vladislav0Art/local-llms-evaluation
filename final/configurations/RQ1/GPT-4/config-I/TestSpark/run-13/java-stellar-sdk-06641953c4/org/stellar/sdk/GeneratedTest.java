package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class GeneratedTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        assertTrue(accountId.length() > 0);
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        char[] secretSeed = keyPair.getSecretSeed();
        assertTrue(secretSeed.length > 0);
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        assertTrue(publicKey.length > 0);
    }

    @Test
    public void verifySignatureTest() {
        String data = "Test signature";
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data.getBytes());
        assertTrue(keyPair.verify(data.getBytes(), signature));
    }

    @Test
    public void verifyInvalidSignatureTest() {
        String data = "Test signature";
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data.getBytes());
        assertFalse(keyPair.verify("Invalid data".getBytes(), signature));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashCode = keyPair.hashCode();
        assertTrue(hashCode > 0);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));
        assertTrue(keyPair1.equals(keyPair1));
    }

}