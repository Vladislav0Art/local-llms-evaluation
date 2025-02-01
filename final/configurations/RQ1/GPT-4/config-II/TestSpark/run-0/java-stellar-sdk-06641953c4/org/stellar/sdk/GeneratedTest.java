package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedTest {

    @Test
    public void KeyPairPublicKeyNullTest() {
        new KeyPair(null, null);
    }

    @Test
    public void KeyPairPublicKeyNonNullTest() {
        java.security.KeyPair keyPair = new KeyPairGenerator().generateKeyPair();
        KeyPair pairUnderTest = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), null);
        Assert.assertNotNull(pairUnderTest);
    }

    @Test
    public void equalsTest() {
        KeyPair first = KeyPair.random();
        KeyPair second = KeyPair.fromSecretSeed(first.getSecretSeed());

        Assert.assertTrue(first.equals(second));
    }

    @Test
    public void canSignTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertTrue(pair.canSign());

        java.security.KeyPair keyPair = new KeyPairGenerator().generateKeyPair();
        pair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), null);
        Assert.assertFalse(pair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair pair = KeyPair.random();
        KeyPair result = KeyPair.fromSecretSeed(pair.getSecretSeed());
        Assert.assertEquals(pair, result);
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair pair = KeyPair.random();
        KeyPair result = KeyPair.fromSecretSeed(new String(pair.getSecretSeed()));
        Assert.assertEquals(pair, result);
    }

    @Test
    public void from_PublicKeyTest() {
        KeyPair pair = KeyPair.random();
        KeyPair result = KeyPair.fromPublicKey(pair.getSecretSeed());
        Assert.assertEquals(pair, result);
    }

    @Test
    public void from_PublicKeyTest_ValueLessThan32() {
        KeyPair.fromPublicKey(new byte[20]);
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertNotNull(pair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertNotNull(pair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertNotNull(pair.getXdrSignerKey());
    }

    @Test
    public void signTest() {
        KeyPair pair = KeyPair.random();
        byte[] data = "Test".getBytes();
        Assert.assertNotNull(pair.sign(data));
    }

    @Test
    public void getAccountIdTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertEquals(pair.getAccountId(), pair.getAccountId());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertArrayEquals(pair.getPublicKey(), pair.getPublicKey());
    }

    @Test
    public void verifyTestWithArray() {
        KeyPair pair = KeyPair.random();
        byte[] data = "Test".getBytes();
        byte[] sig = pair.sign(data);
        Assert.assertTrue(pair.verify(data, sig));
    }

}