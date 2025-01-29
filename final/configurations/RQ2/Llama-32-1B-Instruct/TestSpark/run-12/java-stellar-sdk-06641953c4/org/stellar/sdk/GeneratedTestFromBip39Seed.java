package org.stellar.sdk;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        String bip39Seed = "1234567890abcdef";
        KeyPair key = KeyPair.fromBip39Seed(bip39Seed, 1);
        assertTrue(key.getSecretSeed().length == bip39Seed.length);
        assertEquals(bip39Seed, key.getSecretSeed());
    }

}