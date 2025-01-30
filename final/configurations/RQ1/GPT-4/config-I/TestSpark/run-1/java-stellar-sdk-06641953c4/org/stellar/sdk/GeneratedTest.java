package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromPublicKeyInvalidArgumentsTest() {
        KeyPair.fromPublicKey(new byte[]{1, 2, 3, 4});
    }

    @Test
    public void fromPublicKeyValidArgumentsTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[32]);
        assertNotNull(keyPair);
    }

    @Test
    public void randomKeyPairTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test data".getBytes();
        byte[] signature = keyPair.sign(data);
        boolean verifyResult = keyPair.verify(data, signature);
        assertTrue(verifyResult);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = keyPair1;
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void notEqualsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}