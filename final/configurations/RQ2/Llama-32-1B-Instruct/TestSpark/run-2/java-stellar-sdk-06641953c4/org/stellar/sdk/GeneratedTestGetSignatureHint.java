package org.stellar.sdk;

public class GeneratedTestGetSignatureHint {

    @Test
    public void testGetSignatureHint() {
        SignatureHint hint = SignatureHint.NORMAL;
        EdDSAPublicKey publicKey = new EdDSAPublicKey("publicKey");
        KeyPair keyPair = new KeyPair(publicKey);
        assertTrue(KeyPair.getSignatureHint(keyPair) == hint);
    }

}