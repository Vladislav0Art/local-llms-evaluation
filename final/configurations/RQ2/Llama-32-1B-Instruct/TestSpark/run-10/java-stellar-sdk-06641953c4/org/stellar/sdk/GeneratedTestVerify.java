package org.stellar.sdk;

public class GeneratedTestVerify {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testVerify() {
        byte[] data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        byte[] signature = "your_signature_here".getBytes();
        boolean verified = keyPair.verify(data, signature);
        Preconditions.checkBoolean(verified, "Expected verification result to be true");
    }

}