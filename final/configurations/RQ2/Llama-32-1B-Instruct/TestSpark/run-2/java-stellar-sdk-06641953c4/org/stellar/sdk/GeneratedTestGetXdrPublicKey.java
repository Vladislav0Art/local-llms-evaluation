package org.stellar.sdk;

public class GeneratedTestGetXdrPublicKey {

    @Test
    public void testGetXdrPublicKey() {
        PublicKey publicKey = new PublicKey("publicKey");
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}