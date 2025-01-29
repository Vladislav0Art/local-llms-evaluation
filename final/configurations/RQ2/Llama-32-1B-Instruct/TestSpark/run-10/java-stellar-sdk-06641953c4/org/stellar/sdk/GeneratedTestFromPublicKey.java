package org.stellar.sdk;

public class GeneratedTestFromPublicKey {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testFromPublicKey() {
        KeyPair keyPair = KeyPair.fromPublicKey(SECRET SEED);
        Preconditions.checkNotNull(keyPair, "Expected KeyPair instance");
        // Note: This method is not well-defined in the spec
        assertEquals(SECRET SEED.length, keyPair.getPublicKey().length, 1);
    }

}