package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetSignatureHint_returnsSignatureHint {

    @Test
    public void getSignatureHint_returnsSignatureHint() {
        SignatureHint hint = new SignatureHint(1, 2, 3);
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretKeySpec("secret".toCharArray()));
        assertEquals(hint, keyPair.getSignatureHint());
    }

}