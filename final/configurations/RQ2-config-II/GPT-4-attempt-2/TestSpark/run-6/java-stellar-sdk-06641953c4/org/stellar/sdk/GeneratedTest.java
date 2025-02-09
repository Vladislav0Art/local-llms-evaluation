package org.stellar.sdk;

import static org.junit.Assert.*;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = "SABVMMY64IANAWYZOBVOMMO3SJGK3CO3XQJ66H5BG4GIHN7OTHSYTOHU".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SABVMMY64IANAWYZOBVOMMO3SJGK3CO3XQJ66H5BG4GIHN7OTHSYTOHU";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = "SABVMMY64IANAWYZOBVOMMO3SJGK3CO3XQJ66H5BG4GIHN7OTHSYTOHU".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GDKIJJIKXLOM2NRMPNQZUUYK24ZPVFC6426GZAICZTAGRIJDNEVXH5YV";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = {49, 61, 54, 63, 56, 106, 71, 103, 65};
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
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
    public void getSecretSeedTest() {
        KeyPair keyPair = KeyPair.random();
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
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));
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
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair fromPublicKey = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(keyPair, fromPublicKey);
    }

    @Test
    public void fromXdrSignerKeyTest() {
        KeyPair keyPair = KeyPair.random();
        SignerKey signerKey = keyPair.getXdrSignerKey();
        KeyPair fromSignerKey = KeyPair.fromXdrSignerKey(signerKey);
        assertEquals(keyPair, fromSignerKey);
    }

}