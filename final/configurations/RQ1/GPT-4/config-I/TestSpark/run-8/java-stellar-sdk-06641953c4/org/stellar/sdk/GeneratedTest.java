package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void keyPairFromPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        KeyPair keyPairFromPublicKey = KeyPair.fromPublicKey(keyPair.getPublicKey());
        Assert.assertFalse(keyPairFromPublicKey.canSign());
        Assert.assertEquals(keyPair.getAccountId(), keyPairFromPublicKey.getAccountId());
    }

    @Test
    public void fromSecretSeedCharTest() {
        char[] seed = "SC35MLOO5MTOGSYVEQVJOSXX4CBS55ZNHP5D5QBIUZSG2DSJYZFNFN7E".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GARBCBH4YSHUJLYEPKEPMVYZIJ3ZSQR3QCJ245CWGY64X72JLN4UQSOH";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertEquals(keyPair.getAccountId(), accountId);
    }

    @Test
    public void signAndVerifyTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "stellar";
        byte[] signature = keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
        Assert.assertTrue(keyPair.verify(data.getBytes(), signature));
    }

    @Test
    public void signAndVerifyInvalidTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "stellar";
        byte[] signature = keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
        Assert.assertFalse(keyPair.verify("invalid".getBytes(), signature));
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "stellar".getBytes(StandardCharsets.UTF_8);
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        byte[] hint = decoratedSignature.getHint().getSignatureHint();
        byte[] last4BytesPublicKey = Arrays.copyOfRange(keyPair.getPublicKey(), keyPair.getPublicKey().length - 4, keyPair.getPublicKey().length);
        Assert.assertArrayEquals(hint, last4BytesPublicKey);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair keyPairFromXdr = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertEquals(Arrays.toString(keyPair.getPublicKey()), Arrays.toString(keyPairFromXdr.getPublicKey()));
    }

    @Test
    public void equalsNotNullTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertTrue(keyPair.equals(keyPair));
    }

    @Test
    public void notEqualsNullTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertFalse(keyPair.equals(null));
    }

    @Test
    public void notEqualsDifferentTypeTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertFalse(keyPair.equals("Different type"));
    }

    @Test
    public void equalsSameValuesTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromPublicKey(keyPair1.getPublicKey());
        Assert.assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void notEqualsDifferentValuesTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertFalse(keyPair1.equals(keyPair2));
    }

}