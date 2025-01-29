package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testGetPublicKey() {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromXdrPublicKey(PublicKey.fromBip39Seed(BIP39SEED, 0).getPublicKey()));
        assertEquals("public-key-123456789", keyPair.getPublicKey());
    }

}