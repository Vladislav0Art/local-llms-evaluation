package org.stellar.sdk;

public class GeneratedTestGenerateRandomXdrPublicKey {

    @Test
    public void testGenerateRandomXdrPublicKey() {
        byte[] publicKey = generateRandomXDRPublicKey();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(publicKey));
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(publicKey.length, keyPair.getXdrPublicKey().length, "xdr public key length");
    }

}