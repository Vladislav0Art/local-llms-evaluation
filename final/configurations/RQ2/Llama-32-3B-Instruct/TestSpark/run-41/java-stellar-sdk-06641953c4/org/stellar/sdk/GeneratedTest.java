package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void fromSecretSeedCharArraySeedShouldReturnKeyPair() {
        char[] seed = "my_seed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromSecretSeedStringSeedShouldReturnKeyPair() throws NoSuchAlgorithmException {
        String seed = "my_seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

    @Test
    public void fromPublicBip39SeedAndAccountNumberRandomSeedShouldReturnKeyPair() throws NoSuchAlgorithmException {
        byte[] bip39Seed = {1, 2, 3};
        int accountNumber = 42;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

    @Test
    public void getSecretSeedArrayLengthShouldBe32() {
        char[] seed = "my_seed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(32, keyPair.getSecretSeed().length);
    }

}