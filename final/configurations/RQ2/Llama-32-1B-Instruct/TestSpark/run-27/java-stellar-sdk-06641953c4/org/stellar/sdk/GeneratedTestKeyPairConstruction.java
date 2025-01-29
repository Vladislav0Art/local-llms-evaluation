package org.stellar.sdk;

public class GeneratedTestKeyPairConstruction {

    @Test
    public void testKeyPairConstruction() {
        EdDSAPublicKey publicKey = KeyPair.fromPublicKey( byte[] b);
        assertEquals(publicKey, KeyPair.fromPublicKey(b));
    }

}