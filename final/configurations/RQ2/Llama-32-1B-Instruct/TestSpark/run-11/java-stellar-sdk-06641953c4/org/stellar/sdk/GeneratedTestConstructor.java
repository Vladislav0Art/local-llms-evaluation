package org.stellar.sdk;

public class GeneratedTestConstructor {

    @Test
    public void testConstructor() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{1, 2, 3});
        KeyPair keyPair = new KeyPair(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}