package org.stellar.sdk;

public class GeneratedTestFromPublicKey {

    @Test
    public void testFromPublicKey() {
        byte[] publicKey = "Test Public Key".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair);
    }

}