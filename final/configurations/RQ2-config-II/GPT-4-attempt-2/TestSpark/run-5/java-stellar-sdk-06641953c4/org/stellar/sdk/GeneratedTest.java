package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.Uint256;

import java.util.Random;

public class GeneratedTest {

    final static String HASHED_PUBLIC_KEY = "XXXXXXXXXXXXXXXXXXXXXXXXXX"; // the hashed public key

    @Test
    public void keyPairInitializationTest() {
        final byte[] publicKey = HASHED_PUBLIC_KEY.getBytes();
        final EdDSAPublicKey edDSAPublicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKey, EdDSANamedCurveTable.getByName(EdDSANamedCurveTable.ED_25519)));

        final KeyPair keyPair = new KeyPair(edDSAPublicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringNullTest() {
        KeyPair.fromSecretSeed((String) null);
    }

    @Test
    public void fromSecretSeedCharArrayNullTest() {
        KeyPair.fromSecretSeed((char[]) null);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        final byte[] seed = new byte[256];
        new Random().nextBytes(seed);
        final KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        final String accountId = "GD6GHEOWRHVLVZATJDRS3CQ447PWRO2GO6KQ7BSTRUEGO2ZFVLZ7D3PL";
        final KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        final byte[] publicKey = HASHED_PUBLIC_KEY.getBytes();
        final KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void randomGenerationTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSignatureHintTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void getXdrSignerKeyTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        final KeyPair keyPair = KeyPair.random();
        final PublicKey publicKey = keyPair.getXdrPublicKey();
        Assert.assertNotNull(KeyPair.fromXdrPublicKey(publicKey));
    }

    @Test
    public void fromXdrSignerKeyTest() {
        final KeyPair keyPair = KeyPair.random();
        final SignerKey signerKey = keyPair.getXdrSignerKey();
        Assert.assertNotNull(KeyPair.fromXdrSignerKey(signerKey));
    }

    @Test
    public void signTest() {
        final KeyPair keyPair = KeyPair.random();
        final byte[] data = "test data".getBytes();
        Assert.assertNotNull(keyPair.sign(data));
    }

    @Test
    public void verifyTest() {
        final KeyPair keyPair = KeyPair.random();
        final byte[] data = "test data".getBytes();
        final byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void hashcodeTest() {
        final KeyPair keyPair = KeyPair.random();
        Assert.assertNotEquals(0, keyPair.hashCode());
    }

    @Test
    public void equalsTest() {
        final KeyPair keyPair1 = KeyPair.random();
        final KeyPair keyPair2 = KeyPair.random();
        Assert.assertNotEquals(keyPair1, keyPair2);
    }

}