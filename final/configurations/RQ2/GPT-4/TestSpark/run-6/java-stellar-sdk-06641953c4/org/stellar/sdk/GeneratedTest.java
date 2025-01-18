package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void fromSecretSeedCharTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "seed";
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = {1, 2, 3, 4, 5};
        assertNotNull(KeyPair.fromSecretSeed(seed));
    }

    @Test
    public void fromAccountIdTest() {
        String accountId = "accountId";
        assertNotNull(KeyPair.fromAccountId(accountId));
    }

    @Test
    public void fromPublicKeyBytesTest() {
        byte[] publicKey = {1, 2, 3, 4, 5};
        assertNotNull(KeyPair.fromPublicKey(publicKey));
    }

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = {1, 2, 3, 4, 5};
        int accountNumber = 1;
        assertNotNull(KeyPair.fromBip39Seed(bip39Seed, accountNumber));
    }

    @Test
    public void randomTest() {
        assertNotNull(KeyPair.random());
    }

    @Test
    public void equalsTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        KeyPair keyPair1 = KeyPair.fromSecretSeed(seed);
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair1.equals(keyPair2));
    }

    @Test
    public void hashCodeTest() {
        char[] seed = {'s', 'e', 'e', 'd'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.hashCode());
    }

}