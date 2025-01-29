package org.stellar.sdk;

public class GeneratedTestSign {

    @Test
    public void testSign() {
        String data = "data to sign";
        byte[] signature = org.stellar.sdk.KeyPair.sign(data);
        Preconditions.checkNotNull(signature, "Expected a valid KeyPair instance");
        assertEquals(32, signature.length, "KeyPair should have the correct length for signature");
    }

}