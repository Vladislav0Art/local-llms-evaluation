package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestSigning_SignerPayload {

    @Test
    public void testSigning_SignerPayload() {
        byte[] signerPayload = "signer_payload".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey("eddsa_key"));
        DecoratedSignature decoratedSignature = keyPair.signPayloadDecorated(signerPayload);
        assertNotNull(decoratedSignature);
    }

}