package org.stellar.sdk;

public class GeneratedTestFromXDRPublicKey {

    @Test
    public void testFromXDRPublicKey() {
        PublicKey publicKey = new EdDSAPublicKey();
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(publicKey.length, keyPair.getXdrPublicKey().length, "xdr public key length");
    }

}