package org.stellar.sdk;

public class GeneratedTestSignatureHint {

    @Test
    public void testSignatureHint() {
        KeyPair key = new KeyPair(EdDSAPublicKey.fromSeed("1234567890abcdef"));
        SignatureHint hint = key.getSignatureHint();
        assertNotNull(hint);
        assertEquals("SHA-256", hint.getAlgorithm());
    }

}