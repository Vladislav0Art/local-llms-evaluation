package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.SignerKey;

import javax.xml.bind.DatatypeConverter;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharTest() {
        char[] seed = "SBMPZDFJQ3QOXNPFEYXV4MQP4JKX6VFMH5T370N2ZGL6TVXLGYB2P5BR".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SBMPZDFJQ3QOXNPFEYXV4MQP4JKX6VFMH5T370N2ZGL6TVXLGYB2P5BR";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getSignatureHint());
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getXdrPublicKey());
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test data".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "test data".getBytes();
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        assertNotNull(decoratedSignature);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromSecretSeed(keyPair1.getSecretSeed());
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromSecretSeed(keyPair1.getSecretSeed());
        assertEquals(keyPair1.hashCode(), keyPair2.hashCode());
    }

}