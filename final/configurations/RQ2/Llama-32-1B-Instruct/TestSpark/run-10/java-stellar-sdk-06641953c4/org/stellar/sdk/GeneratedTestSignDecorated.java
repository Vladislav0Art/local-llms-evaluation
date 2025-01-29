package org.stellar.sdk;

public class GeneratedTestSignDecorated {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testSignDecorated() {
        String data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        byte[] signerPayload = data.getBytes();
        DecoratedSignature signature = keyPair.sign(signerPayload);
        Preconditions.checkNotNull(signature, "Expected DecoratedSignature instance");
        assertEquals(SECRET SEED.length, signature.getSignHint().length(), 1);
    }

}