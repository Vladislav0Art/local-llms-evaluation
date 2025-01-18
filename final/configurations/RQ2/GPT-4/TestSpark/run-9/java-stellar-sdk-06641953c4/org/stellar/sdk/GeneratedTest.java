package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private final char[] testData = new char[]{'t', 'e', 's', 't', 'D', 'a', 't', 'a'};
    private final String testString = "testData";
    private final byte[] testBytes = testString.getBytes();

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair kp = KeyPair.fromSecretSeed(testData);
        Assert.assertNotNull(kp);
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair kp = KeyPair.fromSecretSeed(testString);
        Assert.assertNotNull(kp);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair kp = KeyPair.fromSecretSeed(testBytes);
        Assert.assertNotNull(kp);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair kp = KeyPair.fromAccountId(testString);
        Assert.assertNotNull(kp);
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair kp = KeyPair.fromPublicKey(testBytes);
        Assert.assertNotNull(kp);
    }

    @Test
    public void fromBip39SeedTest() {
        KeyPair kp = KeyPair.fromBip39Seed(testBytes, 1);
        Assert.assertNotNull(kp);
    }

    @Test
    public void randomTest() {
        KeyPair kp = KeyPair.random();
        Assert.assertNotNull(kp);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair kp1 = KeyPair.random();
        PublicKey pk = kp1.getXdrPublicKey();
        KeyPair kp2 = KeyPair.fromXdrPublicKey(pk);
        Assert.assertEquals(kp1, kp2);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair kp1 = KeyPair.random();
        SignerKey sk = kp1.getXdrSignerKey();
        KeyPair kp2 = KeyPair.fromXdrSignerKey(sk);
        Assert.assertEquals(kp1, kp2);
    }

    @Test
    public void signAndVerifyTest() {
        KeyPair kp = KeyPair.random();
        byte[] signature = kp.sign(testBytes);
        Assert.assertTrue(kp.verify(testBytes, signature));
    }

    @Test
    public void equalsTest() {
        KeyPair kp1 = KeyPair.random();
        KeyPair kp2 = KeyPair.fromAccountId(kp1.getAccountId());
        Assert.assertEquals(kp1, kp2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair kp1 = KeyPair.random();
        KeyPair kp2 = KeyPair.fromAccountId(kp1.getAccountId());
        Assert.assertEquals(kp1.hashCode(), kp2.hashCode());
    }

}