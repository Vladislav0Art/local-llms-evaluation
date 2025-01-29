package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair key = new KeyPair(fromPublicKey(publicKey));
        assertEquals(publicKey, key.getPublicKey());
    }

}