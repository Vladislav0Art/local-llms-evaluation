package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        byte[] publicKey = org.stellar.sdk.KeyPair.fromPublicKey(new java.security.spec.PKCS8EncodedKeySpec("public key"));
        Preconditions.checkNotNull(publicKey, "Expected a valid KeyPair instance");
        assertEquals(32, publicKey.length, "KeyPair should have the correct length for public key");
    }

}