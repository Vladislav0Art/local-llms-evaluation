package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignFalseTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[32]);
        assertFalse(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = "S0m3S33d".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "S0m3S33d";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = "S0m3S33d".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GDDFVF6554HIOT6PWVAIU3ARV2PABOGJE7HNXEIHTAVP3J2XNUIXDVPV";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[32];
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 0);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("S0m3S33d");
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertNotNull(publicKey);
    }

    @Test
    public void fromXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = keyPair.getXdrPublicKey();
        KeyPair keyPair2 = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair2);
    }

    @Test
    public void signAndVerifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "SomeData".getBytes();
        byte[] signature = keyPair.sign(data);
        boolean verify = keyPair.verify(data, signature);
        assertTrue(verify);
    }

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        assertFalse(keyPair1.equals(keyPair2));
    }

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.hashCode());
    }

}