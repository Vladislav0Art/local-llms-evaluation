package org.stellar.sdk;

public class GeneratedSignByteArray_test {

    @Test
    public void signByteArray_test() throws GeneralSecurityException {
        byte[] data = "test".getBytes();
        KeyPair keyPair = new KeyPair(new EdDSAPrivateKey());
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}