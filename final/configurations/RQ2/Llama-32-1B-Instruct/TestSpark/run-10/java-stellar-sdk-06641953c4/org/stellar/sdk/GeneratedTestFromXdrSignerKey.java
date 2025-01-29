package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testFromXdrSignerKey() {
        SignerKey signerKey = KeyPair.fromXdrSignerKey(new Signature("your_signature_here", SECRET Seed));
        Preconditions.checkNotNull(signerKey, "Expected XDR Signer key instance");
        assertEquals(SECRET SEED.length, signerKey.getXdrSignerKey().length, 1);
    }

}