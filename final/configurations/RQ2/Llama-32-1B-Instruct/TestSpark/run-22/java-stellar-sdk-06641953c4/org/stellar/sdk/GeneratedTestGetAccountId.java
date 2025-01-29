package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBip39Seed(BIP39SEED, 0).getPublicKey());
        assertEquals(ACCOUNT_ID, keyPair.getAccountId());
    }

}