package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedTest {

    @Test
    public void KeyPairNoPrivateKeyTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertTrue(keyPair.canSign() == false);
    }

    @Test
    public void KeyPairWithPrivateKeyTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] secretSeed = "SACJVLYXMINMONYWMRIUROITLNDUSSPTPCIIYFVNYVKOJUZTEFZSYBLE35BXMUXF".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String secretSeed = "SACJVLYXMINMONYWMRIUROITLNDUSSPTPCIIYFVNYVKOJUZTEFZSYBLE35BXMUXF";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] secretSeed = MessageDigest.getInstance("SHA-256").digest("randomString".getBytes());
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = MessageDigest.getInstance("SHA-256").digest("randomString".getBytes());
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
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
    public void signTest() {
        byte[] data = "sampleData".getBytes();
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.sign(data));
    }

    @Test
    public void signDecoratedTest() {
        byte[] data = "sampleData".getBytes();
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.signDecorated(data));
    }

    @Test
    public void signPayloadDecoratedTest() {
        byte[] signerPayload = "samplePayload".getBytes();
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.signPayloadDecorated(signerPayload));
    }

    @Test
    public void verifyTest() {
        byte[] data = "sampleData".getBytes();
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertFalse(keyPair1.equals(keyPair2));
        Assert.assertTrue(keyPair1.equals(keyPair1));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
        Assert.assertEquals(keyPair1.hashCode(), keyPair1.hashCode());
    }

}