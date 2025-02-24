package org.stellar.sdk;

public class GeneratedTestRandomKeyPair {

    @Test
    public void testRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();

        assertNotNull(keyPair);
        assertNotNull(keyPair.getAccountId());
        assertNotNull(keyPair.getPublicKey());
        assertNotNull(keyPair.getSecretSeed());
        assertNotNull(keyPair.getSignatureHint());
        assertNotNull(keyPair.getXdrPublicKey());
        assertNotNull(keyPair.getXdrSignerKey());
    }

}