package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        String publicKey = "1234567890abcdef";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[]{1, 2, 3}));
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}