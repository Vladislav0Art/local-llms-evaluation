package org.stellar.sdk;

public class GeneratedTestVerify {

    @Test
    public void testVerify() {
        byte[] data = new byte[16];
        byte[] signature = org.stellar.sdk.KeyPair.signDecorator(data);
        Preconditions.checkNotNull(signature, "Expected a valid KeyPair instance");

        byte[] expectedSignature;
        try {
            expectedSignature = org.stellar.sdk.KeyPair.fromSignableData(signature);
        } catch (org.stellar.sdk.SignatureException e) {
            return;
        }
        assertEquals(expectedSignature.length, signature.length, "KeyPair should have the correct length for signature");
    }

}