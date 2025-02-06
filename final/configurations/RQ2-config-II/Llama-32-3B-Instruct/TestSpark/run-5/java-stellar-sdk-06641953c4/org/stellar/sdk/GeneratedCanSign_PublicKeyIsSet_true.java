package org.stellar.sdk;

public class GeneratedCanSign_PublicKeyIsSet_true {

    @Test
    public void canSign_PublicKeyIsSet_true() {
        EdDSAPublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(keyPair.canSign());
    }

}