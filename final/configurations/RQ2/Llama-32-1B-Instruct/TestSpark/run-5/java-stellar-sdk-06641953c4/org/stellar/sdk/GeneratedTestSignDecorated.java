package org.stellar.sdk;

public class GeneratedTestSignDecorated {

    @Test
    public void testSignDecorated() {
        String data = "decorated data to sign";
        byte[] signature = org.stellar.sdk.KeyPair.signDecorator(data);
        Preconditions.checkNotNull(signature, "Expected a valid KeyPair instance");
        assertEquals(32, signature.length, "KeyPair should have the correct length for signature");
    }

}