package org.stellar.sdk;

public class GeneratedTestKeyPairSigning {

    @Test
    public void testKeyPairSigning() throws GeneralSecurityException {
        EdDSAPublicKey publicKey = KeyPair.fromPublicKey( byte[] b);
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
        assertFalse(keyPair.canSign());
    }

}