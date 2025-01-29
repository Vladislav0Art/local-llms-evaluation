package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromBip39Seed(BIP39SEED, 0).getPublicKey());
        assertEquals(ACCOUNT_ID, keyPair.getAccountId());
    }

}