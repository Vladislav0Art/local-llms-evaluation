package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        PublicKey publicKey = KeyPair.fromXdrPublicKey(PublicKey.fromByteArray("your_public_key_here"));
        assertNotNull(publicKey);
        assertEquals(EdDSAPublicKey.class, publicKey.getClass());
    }

}