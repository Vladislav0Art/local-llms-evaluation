package org.stellar.sdk;

public class GeneratedSignPayloadDecorated_DecoratedSignatureIsNotNull {

    @Test
    public void signPayloadDecorated_DecoratedSignatureIsNotNull() throws Exception {
        byte[] signerPayload = "testpayload".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertNotNull(keyPair.signPayloadDecorated(signerPayload));
    }

}