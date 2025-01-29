package org.stellar.sdk;

public class GeneratedTestRandomKey {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testRandomKey() {
        KeyPair keyPair = KeyPair.random();
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
    }

}