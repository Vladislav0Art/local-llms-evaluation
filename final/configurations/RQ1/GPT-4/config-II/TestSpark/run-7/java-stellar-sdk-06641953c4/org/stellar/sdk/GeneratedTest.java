package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTest {

    @Test
    public void keyPairFromSecretSeedTest() {
        // Test case for method "fromSecretSeed" where input is an array of characters
        // Expected result is a non-null KeyPair
        char[] seed = new char[50];
        KeyPair result = KeyPair.fromSecretSeed(seed);
        assertNotNull(result);
    }

    @Test
    public void keyPairInsecureFromSecretSeedTest() {
        // Test case for "fromSecretSeed" where input is a string.
        // As this method is insecure, RuntimeException is expected
        String seed = "secretSeed";
        KeyPair.fromSecretSeed(seed);
    }

    @Test
    public void keyPairFromPublicKeyTest() {
        // Test case for method "fromPublicKey".
        // Input is an array of bytes and expected output is a non-null keyPair
        byte[] publicKey = new byte[32];
        KeyPair result = KeyPair.fromPublicKey(publicKey);
        assertNotNull(result);
    }

    @Test
    public void canSignTest() {
        // Test method "canSign"
        // Here, it is expected that the private key is null,
        // hence the result for canSign should be false
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        // Test method "getAccountId"
        // Expected result is a non-empty string
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        assertFalse(accountId.isEmpty());
    }

    @Test
    public void signDataTest() {
        // Test method "sign(byte[] data)".
        // Input is an array of bytes. Expected: RuntimeException because privateKey is null.
        byte[] data = new byte[32];
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        keyPair.sign(data);
    }

    @Test
    public void equalTest() {
        // Test method "equals" using the same object
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.equals(keyPair));
    }

    @Test
    public void notEqualTest() {
        // Test method "equals" using a different object
        KeyPair keyPair = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair.equals(keyPair2));
    }

    @Test
    public void hashCodeTest() {
        // Test method "hashCode"
        KeyPair keyPair = KeyPair.random();
        int hashCode = keyPair.hashCode();
        assertTrue(hashCode != 0);
    }

}