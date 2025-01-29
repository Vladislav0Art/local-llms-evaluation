package org.stellar.sdk;

public class GeneratedTestSignatureHint {

    @Test
    public void testSignatureHint() {
        SignatureHint signatureHint = generateRandomSignatureHint();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(signatureHint.length, keyPair.getSignatureHint().length, "signature hint length");
    }

}