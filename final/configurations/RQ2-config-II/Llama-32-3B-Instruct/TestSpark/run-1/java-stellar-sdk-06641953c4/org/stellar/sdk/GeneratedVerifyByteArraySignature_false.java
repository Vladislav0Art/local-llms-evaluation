package org.stellar.sdk;

public class GeneratedVerifyByteArraySignature_false {

    @Test
    public void verifyByteArraySignature_false() throws GeneralSecurityException, SignatureException {
        byte[] data = "test".getBytes();
        byte[] signature = new byte[0];
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        assertFalse(keyPair.verify(data, signature));
    }

}