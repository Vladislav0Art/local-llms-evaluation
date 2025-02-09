package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
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
        char[] seed = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "test";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "testAccountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
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
        PublicKey mockPublicKey = Mockito.mock(PublicKey.class);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(mockPublicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey mockSignerKey = Mockito.mock(SignerKey.class);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(mockSignerKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        Assert.assertNotNull(keyPair.sign(data));
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        Assert.assertNotNull(keyPair.signDecorated(data));
    }

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        Assert.assertNotNull(keyPair.signPayloadDecorated(data));
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
        byte[] wrongData = new byte[]{4, 5, 6};
        Assert.assertFalse(keyPair.verify(wrongData, signature));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotEquals(0, keyPair.hashCode());
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertEquals(keyPair1, keyPair1);
        Assert.assertNotEquals(keyPair1, keyPair2);
    }

}