package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        PublicKey publicKey = new EdDSAPublicKey(new byte[]{7, 8, 9});
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}