package org.stellar.sdk;

public class GeneratedFromXdrPublicKeyPublicKeyWorks {

    @Test
    public void fromXdrPublicKeyPublicKeyWorks() {
        PublicKey publicKey = PublicKeyFactory.fromBase64("x8p...h9");
        KeyPair keyPair = KeyPair.fromXdrPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

}