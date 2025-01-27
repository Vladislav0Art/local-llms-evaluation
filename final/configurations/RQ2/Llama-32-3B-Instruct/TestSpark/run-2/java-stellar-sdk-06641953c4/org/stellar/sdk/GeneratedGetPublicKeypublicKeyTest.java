package org.stellar.sdk;

public class GeneratedGetPublicKeypublicKeyTest {

    @Test
    public void getPublicKeypublicKeyTest() {
        byte[] publicKey = PublicKey.getInstance(" publicly_visible_key ").getEncoded();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}