package org.stellar.sdk;

public class GeneratedTestXdrSignerKey {

    @Test
    public void testXdrSignerKey() {
        byte[] signerKey = org.stellar.sdk.KeyPair.fromBip39Seed("bip39 seed", 1);
        Preconditions.checkNotNull(signerKey, "Expected a valid KeyPair instance");
        assertEquals(32, signerKey.length, "KeyPair should have the correct length for bip39 seed");
    }

}