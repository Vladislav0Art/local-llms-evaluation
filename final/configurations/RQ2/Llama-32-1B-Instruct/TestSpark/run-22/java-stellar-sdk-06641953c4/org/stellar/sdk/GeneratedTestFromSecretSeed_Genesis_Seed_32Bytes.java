package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_Genesis_Seed_32Bytes {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testFromSecretSeed_Genesis_Seed_32Bytes() {
        byte[] seed = "genesis-123456789".getBytes();
        KeyPair keyPair = new KeyPair(fromSecretSeed(seed));
        assertEquals(ACCOUNT_ID, keyPair.getAccountId());
        assertEquals(EdDSAPublicKey.fromXdrPublicKey(PublicKey.fromBip39Seed(BIP39SEED, 0).getPublicKey()).getPublicKey(), keyPair.getPublicKey());
    }

}