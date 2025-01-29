package org.stellar.sdk;

public class GeneratedTestCanSign {

    private static final String ACCOUNT_ID = "1";

    @Test
    public void testCanSign() {
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromXdrPublicKey(PublicKey.fromBip39Seed(BIP39SEED, 0).getPublicKey()));
        assertTrue(keyPair.canSign());
    }

}