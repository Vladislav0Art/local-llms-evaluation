package org.stellar.sdk;

public class GeneratedTest {

    @Test
    public void testGenerateRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair.getPublicKey());
        assertNotNull(keyPair.getSignatureHint());
        assertNotNull(keyPair.getXdrPublicKey());
        assertNotNull(keyPair.getXdrSignerKey());
    }

    @Test
    public void testCanSign() {
        KeyPair keyPairWithPrivateKey = KeyPair.random();
        assertTrue(keyPairWithPrivateKey.canSign());

        KeyPair keyPairWithoutPrivateKey = new KeyPair(keyPairWithPrivateKey.getPublicKey());
        assertFalse(keyPairWithoutPrivateKey.canSign());
    }

}