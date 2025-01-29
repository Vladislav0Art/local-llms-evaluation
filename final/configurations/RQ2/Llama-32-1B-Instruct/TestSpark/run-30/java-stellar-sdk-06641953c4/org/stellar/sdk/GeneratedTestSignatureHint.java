package org.stellar.sdk;

public class GeneratedTestSignatureHint {

    @Test
    public void testSignatureHint() throws SignatureException {
        String signatureHint = "your_signature_hint_here";
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromPublicKey("your_public_key_here"));
        Preconditions.checkNotNull(keyPair);
        assertEquals(SignatureHint.ALL, keyPair.getSignatureHint());
    }

}