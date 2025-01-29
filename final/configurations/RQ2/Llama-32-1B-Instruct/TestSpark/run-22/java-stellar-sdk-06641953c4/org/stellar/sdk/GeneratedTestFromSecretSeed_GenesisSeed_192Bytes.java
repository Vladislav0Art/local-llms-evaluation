package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_GenesisSeed_192Bytes {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testFromSecretSeed_GenesisSeed_192Bytes() {
        byte[] seed = "genesis-12345678901234567890123456789001234567890".getBytes();
        KeyPair keyPair = new KeyPair(fromSecretSeed(seed));
        assertEquals(ACCOUNT_ID, keyPair.getAccountId());
        assertEquals(EdDSAPublicKey.fromXdrPublicKey(PublicKey.fromBip39Seed(BIP39SEED, 0).getPublicKey()).getPublicKey(), keyPair.getPublicKey());
    }

}