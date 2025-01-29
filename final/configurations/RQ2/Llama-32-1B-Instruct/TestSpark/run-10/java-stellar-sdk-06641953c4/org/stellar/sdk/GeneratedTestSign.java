package org.stellar.sdk;

public class GeneratedTestSign {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testSign() {
        String data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        byte[] signature = keyPair.sign(data.getBytes());
        Preconditions.checkNotNull(signature, "Expected byte array instance");
        assertEquals(SECRET SEED.length, signature.length, 1);
    }

}