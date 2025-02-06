package org.stellar.sdk;

public class GeneratedCreateKeyPairFromPublic_key {

    @Test
    public void createKeyPairFromPublic_key() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertNotNull(keyPair);
    }

}