package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.SignatureHint;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(null);
        assertTrue(keyPair.canSign());
    }

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new char[0]);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("");
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[0]);
        assertNotNull(keyPair);
    }

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("");
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[0]);
        assertNotNull(keyPair);
    }

    @Test
    public void fromBip39SeedTest() {
        KeyPair keyPair = KeyPair.fromBip39Seed(new byte[0], 0);
        assertNotNull(keyPair);
    }

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(null);
        assertNotNull(keyPair.getAccountId());
    }

}