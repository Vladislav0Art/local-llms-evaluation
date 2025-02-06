package org.stellar.sdk;

public class GeneratedSign_BitArrayDataIsNotNull {

    @Test
    public void sign_BitArrayDataIsNotNull() throws Exception {
        byte[] data = new byte[16];
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertNotNull(keyPair.sign(data));
    }

}