package org.stellar.sdk;

public class GeneratedSign_isValidSignature {

    @Test
    public void sign_isValidSignature() throws Exception {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = new byte[]{4, 5, 6};
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertTrue(keyPair.sign(data).signature.equals(signature));
    }

}