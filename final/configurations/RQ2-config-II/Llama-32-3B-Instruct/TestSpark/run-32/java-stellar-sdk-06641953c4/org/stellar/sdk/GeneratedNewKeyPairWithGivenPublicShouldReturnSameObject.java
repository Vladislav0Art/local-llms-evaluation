package org.stellar.sdk;

public class GeneratedNewKeyPairWithGivenPublicShouldReturnSameObject {

    @Test
    public void newKeyPairWithGivenPublicShouldReturnSameObject() {
        EdDSAPublicKey publicKey = ...;
        KeyPair keyPair = new KeyPair(publicKey);
        assertSame(keyPair, new KeyPair(publicKey));
    }

}