package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayNullTest() {
        KeyPair.fromSecretSeed((char[]) null);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "abc";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedStringNullTest() {
        KeyPair.fromSecretSeed((String) null);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = "abc".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedByteArrayNullTest() {
        KeyPair.fromSecretSeed((byte[]) null);
    }

    @Test
    public void fromAccoundIdInvalidTest() {
        KeyPair.fromAccountId("InvalidAccountId");
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey key = new PublicKey();
        KeyPair.fromXdrPublicKey(key);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey key = new SignerKey();
        KeyPair.fromXdrSignerKey(key);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.equals(keyPair));
        assertFalse(keyPair.equals(null));
        assertFalse(keyPair.equals(new Object()));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.hashCode());
    }

}