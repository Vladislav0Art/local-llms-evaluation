package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() throws GeneralSecurityException {
        PublicKey publicKey = KeyPair.fromXdrPublicKey(PublicKey.fromByteArray("your_public_key_here"));
        Preconditions.checkNotNull(publicKey);
        assertEquals(EdDSAPublicKey.class, publicKey.getClass());
    }

}