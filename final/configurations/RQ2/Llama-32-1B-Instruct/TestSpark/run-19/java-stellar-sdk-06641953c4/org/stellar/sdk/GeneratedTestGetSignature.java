package org.stellar.sdk;

public class GeneratedTestGetSignature {

    @Test
    public void testGetSignature() throws SignatureException {
        byte[] data = generateRandomBytes(1024);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        Preconditions.checkNotNull(keyPair, "key pair is null");

        String signature = getSignature(keyPair, data);
        assertEquals(data.length, signature.length, "signature length");
    }

}