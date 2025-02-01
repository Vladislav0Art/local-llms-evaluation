package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void KeyPairPublicKeyOnlyTest() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] publicKey = new byte[32];
        secureRandom.nextBytes(publicKey);

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKey, KeyPair.ed25519)));

        Assert.assertNotNull(keyPair);
        Assert.assertFalse(keyPair.canSign());
    }

    @Test
    public void KeyPairPublicKeyAndPrivateKeyTest() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] publicKey = new byte[32];
        byte[] privateKey = new byte[32];
        secureRandom.nextBytes(publicKey);
        secureRandom.nextBytes(privateKey);

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKey, KeyPair.ed25519)),
                new EdDSAPrivateKey(privateKey));

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedBytesTest() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] seed = new byte[32];
        secureRandom.nextBytes(seed);

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        SecureRandom secureRandom = new SecureRandom();
        char[] seed = new char[32];
        Random random = new Random();
        for (int i = 0; i < seed.length; i++) {
            seed[i] = (char) (random.nextInt(26) + 'a');
        }

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "Test Secret Seed";

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "Test Account Id";

        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        Assert.assertNotNull(keyPair);
        Assert.assertFalse(keyPair.canSign());
    }

    @Test
    public void fromPublicKeyInvalidTest() {
        String publicKeyString = "Invalid Public Key";
        byte[] publicKey = publicKeyString.getBytes();

        KeyPair.fromPublicKey(publicKey);
    }

    @Test
    public void signWithoutPrivateKeyTest() {
        KeyPair keyPairWithoutPrivateKey = KeyPair.random();
        byte[] data = "Test data".getBytes();

        keyPairWithoutPrivateKey.sign(data);
    }

}