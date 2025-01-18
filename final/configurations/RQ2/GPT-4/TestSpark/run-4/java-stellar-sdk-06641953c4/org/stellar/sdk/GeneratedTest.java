package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seedArr = new char[32];
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(seedArr);
        Assert.assertNotNull(fakeKeyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SEED";
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(fakeKeyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(byteArr);
        Assert.assertNotNull(fakeKeyPair);
    }

    @Test
    public void randomTest() {
        KeyPair fakeKeyPair = KeyPair.random();
        Assert.assertNotNull(fakeKeyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "ACCOUNT_ID";
        KeyPair fakeKeyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(fakeKeyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromPublicKey(byteArr);
        Assert.assertNotNull(fakeKeyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] byteArr = new byte[32];
        int accountNumber = 0;
        KeyPair fakeKeyPair = KeyPair.fromBip39Seed(byteArr, accountNumber);
        Assert.assertNotNull(fakeKeyPair);
    }

    @Test
    public void getSignatureHintTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromPublicKey(byteArr);
        Assert.assertNotNull(fakeKeyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromPublicKey(byteArr);
        Assert.assertNotNull(fakeKeyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromPublicKey(byteArr);
        Assert.assertNotNull(fakeKeyPair.getXdrSignerKey());
    }

    @Test
    public void signTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(byteArr);
        Assert.assertNotNull(fakeKeyPair.sign(byteArr));
    }

    @Test
    public void signDecoratedTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(byteArr);
        Assert.assertNotNull(fakeKeyPair.signDecorated(byteArr));
    }

    @Test
    public void verifyTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(byteArr);
        byte[] signature = fakeKeyPair.sign(byteArr);
        Assert.assertTrue(fakeKeyPair.verify(byteArr, signature));
    }

}