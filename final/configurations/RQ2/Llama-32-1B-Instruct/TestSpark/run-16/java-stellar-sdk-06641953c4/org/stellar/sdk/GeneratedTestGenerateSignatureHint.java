package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestGenerateSignatureHint {

    @Test
    public void testGenerateSignatureHint() {
        SignatureHint signatureHint = new EdDSASignatureHint(new byte[]{4, 5, 6});
        assertNotNull(signatureHint);
    }

}