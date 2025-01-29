package org.stellar.sdk;

public class GeneratedTestSigningFromXdrPayload {

    @Test
    public void testSigningFromXdrPayload() {
        byte[] payload = "payload".getBytes();
        KeyPair keyPair = KeyPair.fromXdrSignerKey(new SignerKey());
        assertTrue(keyPair.sign(payload));
    }

}