package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromXdrPublicKey(new DecoratedSignature("your_signature_here", SECRET Seed));
        Preconditions.checkNotNull(publicKey, "Expected XDR Public Key instance");
        assertEquals(SECRET SEED.length, publicKey.getXdrPublicKey().length, 1);
    }

}