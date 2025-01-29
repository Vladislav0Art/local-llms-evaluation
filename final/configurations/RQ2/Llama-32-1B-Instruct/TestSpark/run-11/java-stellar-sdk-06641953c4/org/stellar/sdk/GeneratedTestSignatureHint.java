package org.stellar.sdk;

public class GeneratedTestSignatureHint {

    @Test
    public void testSignatureHint() {
        SignatureHint signatureHint = null;
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[]{4, 5, 6}));
        assertEquals(signatureHint, keyPair.getSignatureHint());
    }

}