package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedTest {

    @Test
    public void constructorTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void canSignTest() {
        EdDSAPublicKey mockedPublicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockedPublicKey);
        Assert.assertFalse(keyPair.canSign());
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
        byte[] seed = "seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "123456";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = "publickey".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        Assert.assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        Assert.assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        Assert.assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void equalsTest() {
        String seed = "seed";
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed.getBytes());
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed.getBytes());
        Assert.assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void hashCodeTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        int hashCode = keyPair.hashCode();
        Assert.assertEquals(keyPair.hashCode(), hashCode);
    }

    @Test
    public void verifyTest() {
        String seed = "seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed.getBytes());
        byte[] data = "data".getBytes();
        byte[] signature = new byte[64];
        Assert.assertFalse(keyPair.verify(data, signature));
    }

}