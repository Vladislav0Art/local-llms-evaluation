package org.stellar.sdk;

public class GeneratedTestKeyPairVerification {

    @Test
    public void testKeyPairVerification() throws GeneralSecurityException {
        EdDSAPublicKey publicKey = KeyPair.fromPublicKey( byte[] b);
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
        assertFalse(keyPair.canSign());
        return true;
    }

}