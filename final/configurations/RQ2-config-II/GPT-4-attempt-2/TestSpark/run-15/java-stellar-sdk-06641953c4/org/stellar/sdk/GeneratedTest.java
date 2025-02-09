package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = "TestSeed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "TestSeed";
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair1);
        Assert.assertTrue(keyPair1.canSign());

        Assert.assertThrows(IllegalArgumentException.class, () -> {
            KeyPair.fromSecretSeed((String) null);
        });
    }

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = "TestSeed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        KeyPair keyPairFromAccountId = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPairFromAccountId);
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        KeyPair keyPairFromPublicKey = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPairFromPublicKey);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        Assert.assertNotNull(accountId);
    }

    @Test
    public void getPublicTest() {
        KeyPair keyPair = KeyPair.random();
        String publicKey = keyPair.getPublicKey();
        Assert.assertNotNull(publicKey);
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        SignatureHint signatureHint = keyPair.getSignatureHint();
        Assert.assertNotNull(signatureHint);
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey key = PublicKey.keyPairToPublicKey(keyPair);
        Assert.assertNotNull(key);
    }

    @Test
    public void signBytesTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "TestData".getBytes();
        byte[] signature = keyPair.sign(data);
        Assert.assertNotNull(signature);
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "TestData".getBytes();
        byte[] signature = keyPair.sign(data);

        Assert.assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair = KeyPair.random();
        boolean result = keyPair.equals(keyPair);
        Assert.assertTrue(result);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashCode = keyPair.hashCode();
        Assert.assertNotNull(hashCode);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair keyPairFromPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertEquals(keyPair, keyPairFromPublicKey);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        KeyPair keyPairFromSignerKey = KeyPair.fromXdrSignerKey(signerKey);
        Assert.assertEquals(keyPair, keyPairFromSignerKey);
    }

}