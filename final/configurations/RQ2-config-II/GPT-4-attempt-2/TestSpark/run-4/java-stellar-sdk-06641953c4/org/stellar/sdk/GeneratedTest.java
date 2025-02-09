package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        KeyPair pair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(pair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair pair = KeyPair.fromSecretSeed("seed");
        Assert.assertNotNull(pair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair pair = KeyPair.fromSecretSeed("seed".getBytes());
        Assert.assertNotNull(pair);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair pair = KeyPair.fromAccountId(keyPair.getAccountId());
        Assert.assertNotNull(pair);
        Assert.assertEquals(pair.getAccountId(), keyPair.getAccountId());
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair pair = KeyPair.fromPublicKey(keyPair.getPublicKey());
        Assert.assertNotNull(pair);
    }

    @Test
    public void fromBip39SeedTest() {
        KeyPair pair = KeyPair.fromBip39Seed("seed".getBytes(), 0);
        Assert.assertNotNull(pair);
    }

    @Test
    public void randomTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertNotNull(pair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        Assert.assertNotNull(accountId);
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        char[] seed = keyPair.getSecretSeed();
        Assert.assertNotNull(seed);
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        Assert.assertNotNull(publicKey);
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        SignatureHint hint = keyPair.getSignatureHint();
        Assert.assertNotNull(hint);
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey xdrPublicKey = keyPair.getXdrPublicKey();
        Assert.assertNotNull(xdrPublicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        Assert.assertNotNull(signerKey);
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] signed = keyPair.sign("test".getBytes());
        Assert.assertNotNull(signed);
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature decorated = keyPair.signDecorated("test".getBytes());
        Assert.assertNotNull(decorated);
    }

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature decorated = keyPair.signPayloadDecorated("test".getBytes());
        Assert.assertNotNull(decorated);
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] signed = keyPair.sign("test".getBytes());
        Assert.assertTrue(keyPair.verify("test".getBytes(), signed));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashCode = keyPair.hashCode();
        Assert.assertTrue(hashCode != 0);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertFalse(keyPair1.equals(keyPair2));
        Assert.assertTrue(keyPair1.equals(keyPair1));
    }

}