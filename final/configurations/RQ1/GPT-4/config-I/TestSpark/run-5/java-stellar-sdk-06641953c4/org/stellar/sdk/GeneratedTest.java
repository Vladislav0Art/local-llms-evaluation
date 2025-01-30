package org.stellar.sdk;

import net.i2p.crypto.eddsa.*;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.security.MessageDigest;

public class GeneratedTest {

    @Test
    public void canSignNoPrivateKeyTest() {
        KeyPairGenerator generator = new KeyPairGenerator();
        java.security.KeyPair keyPairJava = generator.generateKeyPair();

        KeyPair keyPair = new KeyPair((EdDSAPublicKey) keyPairJava.getPublic());
        Assert.assertFalse(keyPair.canSign());
    }

    @Test
    public void canSignWithPrivateKeyTest() {
        KeyPairGenerator generator = new KeyPairGenerator();
        java.security.KeyPair keyPairJava = generator.generateKeyPair();

        KeyPair keyPair = new KeyPair((EdDSAPublicKey) keyPairJava.getPublic(), (EdDSAPrivateKey) keyPairJava.getPrivate());
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = "SASEC43MAGICSEED".toCharArray();

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedInsecureTest() {
        String seed = "SASEC43MAGICSEED";

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = new byte[32];

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyInvalidBytesTest() {
        byte[] publicKeyBytes = new byte[31]; // invalid length

        KeyPair.fromPublicKey(publicKeyBytes);
    }

    @Test
    public void signTest() {
        byte[] seed = new byte[32];
        byte[] data = "testdata".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        byte[] signature = keyPair.sign(data);
        Assert.assertNotNull(signature);
    }

    @Test
    public void signWithoutPrivateKeyTest() {
        KeyPairGenerator generator = new KeyPairGenerator();
        java.security.KeyPair keyPairJava = generator.generateKeyPair();

        KeyPair keyPair = new KeyPair((EdDSAPublicKey) keyPairJava.getPublic());

        keyPair.sign("testdata".getBytes());
    }

    @Test
    public void signDecoratedTest() {
        byte[] seed = new byte[32];
        byte[] data = "testdata".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        DecoratedSignature signature = keyPair.signDecorated(data);
        Assert.assertNotNull(signature);
    }

    @Test
    public void verifyTest() {
        byte[] seed = new byte[32];
        byte[] data = "testdata".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void getXdrPublicKeyTest() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        PublicKey publicKey = keyPair.getXdrPublicKey();
        Assert.assertNotNull(publicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        byte[] seed = new byte[32];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        SignerKey signerKey = keyPair.getXdrSignerKey();
        Assert.assertNotNull(signerKey);
    }

}