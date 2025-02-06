package org.stellar.sdk;

public class GeneratedGetSignatureHint_IsNotNull {

    @Test
    public void getSignatureHint_IsNotNull() {
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertNotNull(keyPair.getSignatureHint());
    }

}