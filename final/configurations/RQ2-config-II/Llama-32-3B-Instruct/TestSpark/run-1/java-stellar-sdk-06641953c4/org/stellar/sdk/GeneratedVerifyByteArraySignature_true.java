package org.stellar.sdk;

public class GeneratedVerifyByteArraySignature_true {

    @Test
    public void verifyByteArraySignature_true() throws GeneralSecurityException, SignatureException {
        byte[] data = "test".getBytes();
        byte[] signature = "test".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        assertTrue(keyPair.verify(data, signature));
    }

}