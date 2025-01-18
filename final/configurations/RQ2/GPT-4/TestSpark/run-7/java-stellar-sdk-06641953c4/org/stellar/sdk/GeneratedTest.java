package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

import java.nio.charset.StandardCharsets;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedUsingCharArrayTest() {
        String seedString = "SAZJ3FQFZFSM5HNPBWTHX7R6SDBKINKWZXK3HXHX5CU37VFL23SCZQQZ";
        char[] seed = seedString.toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedUsingStringTest() {
        String seed = "SAZJ3FQFZFSM5HNPBWTHX7R6SDBKINKWZXK3HXHX5CU37VFL23SCZQQZ";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

    @Test
    public void signTest() {
        byte[] data = "Test data".getBytes(StandardCharsets.UTF_8);
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void signDecoratedTest() {
        byte[] data = "Test data".getBytes(StandardCharsets.UTF_8);
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature signature = keyPair.signDecorated(data);
        Assert.assertNotNull(signature);
    }

    @Test
    public void signPayloadDecoratedTest() {
        byte[] payload = "Test payload".getBytes(StandardCharsets.UTF_8);
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(payload);
        Assert.assertNotNull(decoratedSignature);
    }

    @Test
    public void equalsShouldReturnFalseForDifferentObjectsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertNotEquals(keyPair1, keyPair2);
    }

    @Test
    public void equalsShouldReturnTrueForIdenticalObjectsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = keyPair1;
        Assert.assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair1 = KeyPair.random();
        PublicKey publicKey = keyPair1.getXdrPublicKey();
        KeyPair keyPair2 = KeyPair.fromXdrPublicKey(publicKey);
        Assert.assertEquals(keyPair1.getAccountId(), keyPair2.getAccountId());
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair1 = KeyPair.random();
        SignerKey signerKey = keyPair1.getXdrSignerKey();
        KeyPair keyPair2 = KeyPair.fromXdrSignerKey(signerKey);
        Assert.assertEquals(keyPair1.getAccountId(), keyPair2.getAccountId());
    }

}