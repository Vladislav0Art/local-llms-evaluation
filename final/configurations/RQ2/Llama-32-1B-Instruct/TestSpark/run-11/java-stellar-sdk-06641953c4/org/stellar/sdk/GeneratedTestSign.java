package org.stellar.sdk;

public class GeneratedTestSign {

    @Test
    public void testSign() {
        String data = "hello-world";
        SignatureHint signatureHint = null;
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new byte[]{1, 2, 3}));
        DecoratedSignature signature = keyPair.sign(data);
        assertEquals(signature, keyPair.signPayloadDecorated("1234567890abcdef"));
    }

}