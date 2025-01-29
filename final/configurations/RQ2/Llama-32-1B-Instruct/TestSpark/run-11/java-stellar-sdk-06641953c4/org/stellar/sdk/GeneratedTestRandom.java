package org.stellar.sdk;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey(new byte[]{4, 5, 6});
        KeyPair keyPair = KeyPair.fromRandom();
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}