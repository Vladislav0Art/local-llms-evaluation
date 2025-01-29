package org.stellar.sdk;

public class GeneratedTestFromPublicKey {

    @Test
    public void testFromPublicKey() throws GeneralSecurityException {
        byte[] publicKey = "your_public_key_here".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(publicKey.length, keyPair.getPublicKey().length, "public key length");
    }

}