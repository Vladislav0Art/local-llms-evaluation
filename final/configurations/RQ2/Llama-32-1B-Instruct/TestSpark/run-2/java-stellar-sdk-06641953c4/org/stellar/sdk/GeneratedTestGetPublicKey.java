package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        byte[] publicKeyBytes = "publicKey";
        EdDSAPublicKey publicKey = new EdDSAPublicKey(publicKeyBytes);
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(Arrays.equals(keyPair.getPublicKey(), publicKeyBytes));
    }

}