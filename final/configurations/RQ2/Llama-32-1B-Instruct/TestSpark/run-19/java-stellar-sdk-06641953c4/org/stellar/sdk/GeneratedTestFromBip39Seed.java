package org.stellar.sdk;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() throws GeneralSecurityException {
        byte[] bip39Seed = "your_bip39_seed_here".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 1);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(16, keyPair.getSecretSeed().length, "secret seed length");
    }

}