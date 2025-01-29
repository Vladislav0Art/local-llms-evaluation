package org.stellar.sdk;

public class GeneratedTestSignPayloadDecorated {

    @Test
    public void testSignPayloadDecorated() {
        String data = "payload decorated to sign";
        byte[] signerPayload = org.stellar.sdk.KeyPair.signPayloadDecorator(data);
        Preconditions.checkNotNull(signerPayload, "Expected a valid KeyPair instance");
        assertEquals(32, signerPayload.length, "KeyPair should have the correct length for payload decorated signature");
    }

}