package org.stellar.sdk;

public class GeneratedWhenGettingSignatureHintThenReturnsSignatureHint {

    @Test
    public void whenGettingSignatureHintThenReturnsSignatureHint() {
        KeyPair keyPair = KeyPair.random();
        SignatureHint signatureHint = new SignatureHint(keyPair.getSignatureHint());
        assertEquals(signatureHint, keyPair.getSignatureHint());
    }

}