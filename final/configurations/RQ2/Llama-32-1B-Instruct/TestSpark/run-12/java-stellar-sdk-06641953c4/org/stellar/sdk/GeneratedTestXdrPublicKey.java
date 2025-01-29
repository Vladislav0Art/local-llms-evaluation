package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        PublicKey publicKey = EdDSAEngine.getEdPubKey("1234567890abcdef");
        KeyPair key = KeyPair.fromPublicKey(publicKey);
        assertTrue(key.getXdrPublicKey().length == publicKey.length);
        assertEquals(publicKey, key.getXdrPublicKey());
    }

}