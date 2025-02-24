package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

public class GeneratedTest {

    @Test
    public void testCanSign() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPrivateKey(new EdDSAPrivateKeySpec(new byte[32], EdDSAParameterSpec.ED25519)));
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void testFromSecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed("seed");
        Assert.assertEquals("", keyPair.getAccountId());
    }

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
        Assert.assertEquals("accountId", keyPair.getAccountId());
    }

    @Test
    public void testFromPublicKey() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[10]);
        Assert.assertEquals(0, keyPair.getPublicKey().length);
    }

    @Test
    public void testFromBip39Seed() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[10], 10);
        Assert.assertEquals(0, keyPair.getPublicKey().length);
    }

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair);
    }

}