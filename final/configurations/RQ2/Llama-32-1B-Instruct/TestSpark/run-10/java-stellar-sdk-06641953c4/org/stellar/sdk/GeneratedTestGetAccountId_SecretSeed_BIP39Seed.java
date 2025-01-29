package org.stellar.sdk;

public class GeneratedTestGetAccountId_SecretSeed_BIP39Seed {

    private static final String SECRET_SEED = "your_secret_seed_here";
    private static final char[] SECRET
    Seed =SECRET_SEED.getBytes();
    private static final byte[] BIP39Seed = "bip39_seed_here".getBytes();

    @Test
    public void testGetAccountId_SecretSeed_BIP39Seed() {
        String accountId = KeyPair.fromSecretSeed(SECRET Seed).getAccountId();
        assertEquals("your_account_id_here", accountId);
    }

}