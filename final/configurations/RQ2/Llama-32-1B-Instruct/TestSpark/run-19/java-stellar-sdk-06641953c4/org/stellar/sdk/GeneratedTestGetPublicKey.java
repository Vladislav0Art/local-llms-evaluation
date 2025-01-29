package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        byte[] publicKey = generateRandomPublicKey();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(publicKey));
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(publicKey.length, keyPair.getPublicKey().length, "public key length");
    }

}