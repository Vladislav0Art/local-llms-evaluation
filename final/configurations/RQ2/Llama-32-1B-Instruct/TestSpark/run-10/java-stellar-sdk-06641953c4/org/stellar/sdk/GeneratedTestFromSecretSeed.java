package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testFromSecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed(SECRET Seed);
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        assertEquals(SECRET Seed.length, keyPair.getSecretSeed().length, 1);
    }

}