package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedTest {

    @Test
    public void KeyPairConstructorTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(new byte[32], EdDSANamedCurveTable.ED_25519));
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
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
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = {1, 2, 3, 4};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GCM3XJ4WDLA63WSXFYUNXFETQ5JFYYNXUZGYZEOS5VGODFEGY2Y2E3Y6";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = {1, 2, 3, 4};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
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
        String accountId = keyPair.getAccountId();
        Assert.assertNotNull(accountId);
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        char[] secretSeed = keyPair.getSecretSeed();
        Assert.assertNotNull(secretSeed);
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
        SignatureHint signatureHint = keyPair.getSignatureHint();
        Assert.assertNotNull(signatureHint);
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        Assert.assertNotNull(publicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        Assert.assertNotNull(signerKey);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        PublicKey key = new PublicKey();
        key.setKeyType(PublicKeyType.PUBLIC_KEY_TYPE_ED25519);
        KeyPair keyPair = KeyPair.fromXdrPublicKey(key);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        SignerKey key = new SignerKey();
        key.setKeyType(SignerKeyType.SIGNER_KEY_TYPE_ED25519);
        KeyPair keyPair = KeyPair.fromXdrSignerKey(key);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4};
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        Assert.assertNotNull(decoratedSignature);
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4};
        byte[] signature = keyPair.sign(data);
        boolean isVerified = keyPair.verify(data, signature);
        Assert.assertTrue(isVerified);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        int hashBefore = keyPair.hashCode();
        int hashAfter = keyPair.hashCode();
        Assert.assertEquals(hashBefore, hashAfter);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertFalse(keyPair1.equals(keyPair2));
    }

}