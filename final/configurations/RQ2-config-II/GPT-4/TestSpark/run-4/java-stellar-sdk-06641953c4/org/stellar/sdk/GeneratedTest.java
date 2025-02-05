package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.Security;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

import static org.junit.Assert.*;

public class GeneratedTest {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SA6XHAH4GNLRWWWF6TEVEWNS44CBNFAJWHWOPZCVZOUXSQA7BOYN4X4K".toCharArray());
        assertEquals("GAB5GZDJGZ5EZD3VOOU4OZ5JJ6BPKHLBOMISOHYNYUR7AYUYIAXBEDTQ", keyPair.getAccountId());
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SA6XHAH4GNLRWWWF6TEVEWNS44CBNFAJWHWOPZCVZOUXSQA7BOYN4X4K");
        assertEquals("GAB5GZDJGZ5EZD3VOOU4OZ5JJ6BPKHLBOMISOHYNYUR7AYUYIAXBEDTQ", keyPair.getAccountId());
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("GAB5GZDJGZ5EZD3VOOU4OZ5JJ6BPKHLBOMISOHYNYUR7AYUYIAXBEDTQ");
        assertEquals("GAB5GZDJGZ5EZD3VOOU4OZ5JJ6BPKHLBOMISOHYNYUR7AYUYIAXBEDTQ", keyPair.getAccountId());
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.fromPublicKey(keyPair1.getPublicKey());
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
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
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        assertNotNull(signerKey);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair1 = KeyPair.random();
        PublicKey publicKey = keyPair1.getXdrPublicKey();
        KeyPair keyPair2 = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));
        assertTrue(keyPair1.equals(keyPair1));
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "stellar".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}