package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        Assert.assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "seed";
        Assert.assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "account";
        Assert.assertNotNull(KeyPair.fromAccountId(accountId));
    }

    @Test
    public void randomTest() {
        Assert.assertNotNull(KeyPair.random());
    }

    @Test
    public void hashCodeTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertNotEquals(0, keyPair.hashCode());
    }

    @Test
    public void equalsTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair1 = new KeyPair(publicKey);
        KeyPair keyPair2 = new KeyPair(publicKey);
        Assert.assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void notEqualsTest() {
        EdDSAPublicKey publicKey1 = Mockito.mock(EdDSAPublicKey.class, "publicKey1");
        EdDSAPublicKey publicKey2 = Mockito.mock(EdDSAPublicKey.class, "publicKey2");
        KeyPair keyPair1 = new KeyPair(publicKey1);
        KeyPair keyPair2 = new KeyPair(publicKey2);
        Assert.assertFalse(keyPair1.equals(keyPair2));
    }

}