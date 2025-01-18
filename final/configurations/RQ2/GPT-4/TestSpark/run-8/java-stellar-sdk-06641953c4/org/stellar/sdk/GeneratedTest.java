package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedTest {

    @Test
    public void fromSecretSeedCharTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[]{'a', 'b', 'c'});
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("abc");
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[]{1, 2, 3});
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("abc");
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[]{1, 2, 3});
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[]{1, 2, 3}, 1);
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
        byte[] MockData = new byte[]{1, 2, 3};
        Assert.assertNotNull(keyPair.sign(MockData));
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] MockData = new byte[]{1, 2, 3};
        Assert.assertNotNull(keyPair.signDecorated(MockData));
    }

    @Test
    public void signPayloadDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] MockPayload = new byte[]{1, 2, 3};
        Assert.assertNotNull(keyPair.signPayloadDecorated(MockPayload));
    }

}