package org.stellar.sdk;

public class GeneratedTestSign {

    @Test
    public void testSign() throws SignatureException {
        byte[] data = generateRandomBytes(1024);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        Preconditions.checkNotNull(keyPair, "key pair is null");

        String signature = sign(keyPair, data);
        assertEquals(data.length, signature.length, "signature length");
    }

}