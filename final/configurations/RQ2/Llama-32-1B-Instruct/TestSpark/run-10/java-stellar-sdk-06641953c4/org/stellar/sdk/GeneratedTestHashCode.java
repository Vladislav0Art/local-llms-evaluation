package org.stellar.sdk;

public class GeneratedTestHashCode {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testHashCode() {
        String data = "your_data_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(SECRET Seed));
        int hashCode = keyPair.hashCode();
        Preconditions.checkInt(hashCode, "Expected hash code to be correct");
    }

}