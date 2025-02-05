package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.KeyPairGenerator;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void KeyPairConstructorTest() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new EdDSAPublicKeySpec());
        assertNotNull(new KeyPair(publicKey));
    }

    @Test
    public void fromSecretSeedWithCharArrayTest() {
        char[] seed = new char[]{'s', 'e', 'e', 'd'};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedWithStringTest() {
        String seed = "seed";
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedWithByteArrayTest() {
        byte[] seed = new byte[]{1, 2, 3};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "GABHHQZPEIMUJUDVHBVF6B3D4NXC4QIEVJMBXFHXLSZDDOZGZU7C5HL6";
        assertNotNull(KeyPair.fromAccountId(accountId));
    }

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[]{1, 2, 3};
        assertNotNull(KeyPair.fromPublicKey(publicKey));
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[]{1, 2, 3};
        int accountNumber = 1;
        assertNotNull(KeyPair.fromBip39Seed(bip39Seed, accountNumber));
    }

    @Test
    public void randomTest() {
        assertNotNull(KeyPair.random());
    }

    @Test
    public void getAccountIdTest() {
        KeyPair keypair = KeyPair.random();
        assertNotNull(keypair.getAccountId());
    }

}