package org.stellar.sdk;

public class GeneratedTestGenerateRandomKeyPair {

    @Test
    public void testGenerateRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
        assertNotNull(keyPair.getSignatureHint());
        assertNotNull(keyPair.getXdrPublicKey());
        assertNotNull(keyPair.getXdrSignerKey());
    }

}