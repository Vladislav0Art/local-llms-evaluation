package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.SignatureHint;

import java.security.GeneralSecurityException;
import java.security.SignatureException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void KeyPairTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);

        KeyPair keyPair = new KeyPair(publicKey, privateKey);

        Assert.assertEquals(publicKey, keyPair.mPublicKey);
        Assert.assertEquals(privateKey, keyPair.mPrivateKey);
    }

    @Test
    public void canSignTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);

        KeyPair keyPairWithPrivateKey = new KeyPair(publicKey, privateKey);
        Assert.assertTrue(keyPairWithPrivateKey.canSign());

        KeyPair keyPairWithoutPrivateKey = new KeyPair(publicKey, null);
        Assert.assertFalse(keyPairWithoutPrivateKey.canSign());
    }

    @Test
    public void getAccountIdTest() {
        String accountId = "testAccountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        Assert.assertEquals(accountId, keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        char[] seed = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertTrue(Arrays.equals(seed, keyPair.getSecretSeed()));
    }

    @Test
    public void getPublicKeyTest() {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        Assert.assertTrue(Arrays.equals(publicKeyArray, keyPair.getPublicKey()));
    }

    @Test
    public void getSignatureHintTest() {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        SignatureHint signatureHint = keyPair.getSignatureHint();

        Assert.assertNotNull(signatureHint);
    }

    @Test
    public void signTest() throws GeneralSecurityException {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        byte[] data = {'t', 'e', 's', 't'};

        try {
            keyPair.sign(data);
            keyPair.sign(null);
        } catch (RuntimeException e) {
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }

    @Test
    public void signDecoratedTest() {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        byte[] data = {'t', 'e', 's', 't'};

        try {
            DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
            Assert.assertNotNull(decoratedSignature);
        } catch (RuntimeException e) {
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }

    @Test
    public void signPayloadDecoratedTest() {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        byte[] signerPayload = {'t', 'e', 's', 't'};

        try {
            DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);
            Assert.assertNotNull(decoratedSignature);
        } catch (RuntimeException e) {
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }

    @Test
    public void verifyTest() throws GeneralSecurityException {
        byte[] publicKeyArray = {'t', 'e', 's', 't'};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyArray);

        byte[] data = {'t', 'e', 's', 't'};
        byte[] signature = {'s', 'i', 'g'};

        try {
            Assert.assertFalse(keyPair.verify(data, signature));
            Assert.assertFalse(keyPair.verify(null, null));
        } catch (RuntimeException e) {
            Assert.assertTrue(e instanceof RuntimeException);
        }

        try {
            keyPair.verify(data, null);
            Assert.fail("Expected a SignatureException to be thrown");
        } catch (SignatureException e) {
            Assert.assertTrue(e instanceof SignatureException);
        }
    }

    @Test
    public void equalsTest() {
        char[] seed = {'t', 'e', 's', 't'};
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed);
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed);
        KeyPair keyPair3 = KeyPair.random();

        Assert.assertTrue(keyPair1.equals(keyPair2));
        Assert.assertFalse(keyPair1.equals(keyPair3));
        Assert.assertFalse(keyPair1.equals(null));
        Assert.assertFalse(keyPair1.equals(new Object()));
    }

}