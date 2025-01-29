package org.stellar.sdk;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        String bip39Seed = "bip39 seed";
        byte[] seed = org.stellar.sdk.KeyPair.fromBip39Seed(bip39Seed, 1);
        Preconditions.checkNotNull(seed, "Expected a valid KeyPair instance");
        assertEquals(16, seed.length, "KeyPair should have the correct length for Bip39 seed");
    }

}