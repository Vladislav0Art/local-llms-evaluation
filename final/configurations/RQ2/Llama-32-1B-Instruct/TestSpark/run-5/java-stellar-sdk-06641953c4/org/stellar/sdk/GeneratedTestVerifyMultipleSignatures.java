package org.stellar.sdk;

public class GeneratedTestVerifyMultipleSignatures {

    @Test
    public void testVerifyMultipleSignatures() {
        byte[] data = new byte[16];
        byte[] signature1 = org.stellar.sdk.KeyPair.signDecorator(data);
        byte[] signature2 = org.stellar.sdk.KeyPair.signDecorator(new java.util.Arrays.copyOfRange(data, 0, 8));
        Preconditions.checkNotNull(signature1, "Expected a valid KeyPair instance");
        assertEquals(32, signature1.length, "KeyPair should have the correct length for first signature");
        Preconditions.checkNotNull(signature2, "Expected a valid KeyPair instance");
        assertEquals(32, signature2.length, "KeyPair should have the correct length for second signature");

        byte[] expectedSignature;
        try {
            expectedSignature = org.stellar.sdk.KeyPair.fromSignableData(signature1);
        } catch (org.stellar.sdk.SignatureException e) {
            return;
        }
        assertEquals(expectedSignature.length, signature2.length, "KeyPair should have the correct length for second signature");

        byte[] verifiedSignature = org.stellar.sdk.KeyPair.verify(new byte[16], signature1);
        Preconditions.checkNotNull(verifiedSignature, "Expected a valid KeyPair instance");
        assertTrue(Arrays.equals(signature2, verifiedSignature), "Signature not verified correctly");
    }

}