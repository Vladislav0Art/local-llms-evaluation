package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        byte[] publicKey = "your_public_key_here".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}