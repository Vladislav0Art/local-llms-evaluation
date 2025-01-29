package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSigning_SignatureHint {

    @Test
    public void testSigning_SignatureHint() {
        SignatureHint signatureHint = SignatureHint.PALINDROMIC;
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("eddsa_key"));
        DecoratedSignature decoratedSignature = keyPair.signDecorated(signatureHint.getBytes());
        assertNotNull(decoratedSignature);
    }

}