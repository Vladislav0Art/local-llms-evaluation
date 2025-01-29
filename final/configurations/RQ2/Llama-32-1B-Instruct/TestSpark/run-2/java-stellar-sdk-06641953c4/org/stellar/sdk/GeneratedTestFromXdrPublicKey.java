package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = new PublicKey("publicKey");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}