package org.stellar.sdk;

public class GeneratedTestSigningFromBip39Seed {

    @Test
    public void testSigningFromBip39Seed() {
        byte[] bip39Seed = "bip39_seed".getBytes();
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed);
        assertEquals(KeyPair.class, keyPair.getClass());
        assertNotEquals(null, keyPair.getSecretSeed());
    }

}