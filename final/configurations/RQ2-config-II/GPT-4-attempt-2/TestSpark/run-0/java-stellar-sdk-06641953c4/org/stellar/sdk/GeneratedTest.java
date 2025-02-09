package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertEquals(keyPair.canSign(), true);
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = new char[]{'s', 'e', 'e', 'd'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey key = keyPair.getXdrPublicKey();
        KeyPair newKeyPair = KeyPair.fromXdrPublicKey(key);
        Assert.assertEquals(keyPair, newKeyPair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey key = keyPair.getXdrSignerKey();
        KeyPair newKeyPair = KeyPair.fromXdrSignerKey(key);
        Assert.assertEquals(keyPair, newKeyPair);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertNotEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashCode = keyPair.hashCode();
        Assert.assertEquals(hashCode, keyPair.hashCode());
    }

}