package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = new KeyPair(null);
        SignatureHint signatureHint = keyPair.getSignatureHint();
        assertNotNull(signatureHint);
    }

}