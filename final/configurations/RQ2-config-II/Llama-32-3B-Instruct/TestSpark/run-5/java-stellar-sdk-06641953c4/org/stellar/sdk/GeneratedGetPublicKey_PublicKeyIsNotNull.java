package org.stellar.sdk;

public class GeneratedGetPublicKey_PublicKeyIsNotNull {

    @Test
    public void getPublicKey_PublicKeyIsNotNull() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertNotNull(keyPair.getPublicKey());
    }

}