package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromPublicKey(SECRET SEED);
        Preconditions.checkNotNull(publicKey, "Expected KeyPair instance");
        assertEquals(SECRET SEED.length, publicKey.getXdrPublicKey().length, 1);
    }

}