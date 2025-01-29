package org.stellar.sdk;

public class GeneratedTestXdrPublicKey {

    @Test
    public void testXdrPublicKey() {
        PublicKey publicKey = generateRandomXdrPublicKey();
        KeyPair keyPair = new KeyPair(publicKey);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(publicKey.length, keyPair.getXdrPublicKey().length, "xdr public key length");
    }

}