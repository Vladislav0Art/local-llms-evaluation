package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        PublicKey publicKey = new EdDSAPublicKey(new byte[]{7, 8, 9});
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}