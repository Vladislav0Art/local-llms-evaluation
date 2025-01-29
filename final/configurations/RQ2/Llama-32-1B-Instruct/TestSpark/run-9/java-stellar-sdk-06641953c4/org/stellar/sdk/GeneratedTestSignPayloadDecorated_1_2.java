package org.stellar.sdk;

public class GeneratedTestSignPayloadDecorated_1_2 {

    @Test
    public void testSignPayloadDecorated_1_2() {
        KeyPair key = new KeyPair(new EdDSAPublicKey("xpub-key"));
        byte[] data = "payload".getBytes();
        DecoratedSignature signature = key.sign(payload(decode(data)));
        Preconditions.assertEquals(EdDSAEngine.verify(payload(decode(new ByteArrayOutputStream())), signature), true);
    }

}