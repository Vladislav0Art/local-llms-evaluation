package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = new String("SEED").toCharArray();
        KeyPair result = KeyPair.fromSecretSeed(seed);
        assertNotNull(result);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SEED";
        KeyPair result = KeyPair.fromSecretSeed(seed);
        assertNotNull(result);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = new String("SEED").getBytes();
        KeyPair result = KeyPair.fromSecretSeed(seed);
        assertNotNull(result);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "ACCOUNT_ID";
        KeyPair result = KeyPair.fromAccountId(accountId);
        assertNotNull(result);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new String("PUBLIC_KEY").getBytes();
        KeyPair result = KeyPair.fromPublicKey(publicKey);
        assertNotNull(result);
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = "BIP39_SEED".getBytes();
        int accountNumber = 1;
        KeyPair result = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(result);
    }

    @Test
    public void randomTest() {
        KeyPair result = KeyPair.random();
        assertNotNull(result);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey key = mock(PublicKey.class);
        KeyPair result = KeyPair.fromXdrPublicKey(key);
        assertNotNull(result);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey key = mock(SignerKey.class);
        KeyPair result = KeyPair.fromXdrSignerKey(key);
        assertNotNull(result);
    }

    @Test
    public void verifyTest() {
        byte[] data = "some data".getBytes();
        byte[] signature = "signature".getBytes();
        KeyPair keyPair = KeyPair.random();
        boolean result = keyPair.verify(data, signature);
        assertNotNull(result);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertNotEquals(keyPair1, keyPair2);
    }

    @Test
    public void signNullException() {
        KeyPair keyPair = KeyPair.random();
        keyPair.sign(null);
    }

    @Test
    public void fromAccountIdException() {
        KeyPair.fromAccountId(null);
    }

}