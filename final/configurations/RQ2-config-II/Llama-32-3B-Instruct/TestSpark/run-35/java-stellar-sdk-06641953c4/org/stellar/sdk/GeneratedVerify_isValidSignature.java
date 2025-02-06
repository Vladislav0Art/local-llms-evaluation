package org.stellar.sdk;

public class GeneratedVerify_isValidSignature {

    @Test
    public void verify_isValidSignature() throws Exception {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = new byte[]{4, 5, 6};
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.verify(data, signature));
    }

}