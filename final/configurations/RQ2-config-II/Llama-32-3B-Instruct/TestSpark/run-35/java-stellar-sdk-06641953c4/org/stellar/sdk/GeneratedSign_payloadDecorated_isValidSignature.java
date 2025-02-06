package org.stellar.sdk;

public class GeneratedSign_payloadDecorated_isValidSignature {

    @Test
    public void sign_payloadDecorated_isValidSignature() throws Exception {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signerPayload = new byte[]{4, 5, 6};
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.signPayloadDecorated(data, signerPayload).signature.equals(new byte[]{4, 5, 6}));
    }

}