package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey pubKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(pubKey);
        Assert.assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'s', 'e', 'c', 'r', 'e', 't'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "secret";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = "secret".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
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
        byte[] publicKey = "publicKey".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey pubKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(pubKey);
        Assert.assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey publicKey = Mockito.mock(PublicKey.class);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey signerKey = Mockito.mock(SignerKey.class);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void verifyNullDataTest() {
        EdDSAPublicKey pubKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(pubKey);
        byte[] signature = "signature".getBytes();
        keyPair.verify(null, signature);
    }

    @Test
    public void verifyTest() {
        byte[] data = "data".getBytes();
        byte[] signature = "signature".getBytes();
        String seed = "secret";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair.verify(data, signature));
    }

}