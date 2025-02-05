package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec(bytes, mc));
        KeyPair keyPair = new KeyPair(publicKey);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedTestUsingCharArray() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW".toCharArray());
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedTestUsingString() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW");
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedTestUsingByteArray() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW".getBytes());
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("SGUZP5NW");
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey("SGUZP5NW".getBytes());
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromBip39SeedTest() {
        KeyPair keyPair = KeyPair.fromBip39Seed("SGUZP5NW".getBytes(), 1);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getAccountId());
    }

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW");
        assertNotNull(keyPair.getSecretSeed());
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
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
        assertEquals(PublicKeyType.PUBLIC_KEY_TYPE_ED25519, publicKey.getDiscriminant());
    }

    @Test
    public void getXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        assertNotNull(signerKey);
        assertEquals(SignerKeyType.SIGNER_KEY_TYPE_ED25519, signerKey.getDiscriminant());
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair keyPairFromXdr = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPairFromXdr);
        assertEquals(keyPair, keyPairFromXdr);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        KeyPair keyPairFromXdr = KeyPair.fromXdrSignerKey(signerKey);
        assertNotNull(keyPairFromXdr);
        assertEquals(keyPair, keyPairFromXdr);
    }

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW");
        byte[] data = "Hello, World!".getBytes();
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("SGUZP5NW");
        byte[] data = "Hello, World!".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.fromSecretSeed("SGUZP5NW");
        KeyPair keyPair2 = KeyPair.fromSecretSeed("SGUZP5NW");
        assertEquals(keyPair1, keyPair2);
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        assertEquals(keyPair.hashCode(), keyPair.hashCode());
    }

}