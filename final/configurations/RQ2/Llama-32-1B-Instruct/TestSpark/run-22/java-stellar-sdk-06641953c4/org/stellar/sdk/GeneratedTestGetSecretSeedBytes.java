package org.stellar.sdk;

public class GeneratedTestGetSecretSeedBytes {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testGetSecretSeedBytes() {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromXdrPublicKey(PublicKey.fromBip39Seed(BIP39SEED, 0).getPublicKey()));
        assertEquals("secret-seed-123456789".getBytes(), keyPair.getSecretSeed());
    }

}