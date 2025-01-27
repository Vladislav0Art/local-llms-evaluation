package org.stellar.sdk;

public class GeneratedToXdrPublicKeyPublicKeyWorks {

    @Test
    public void toXdrPublicKeyPublicKeyWorks() {
        byte[] secretSeed = new byte[]{(byte) 'a'};
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        PublicKey publicKey = keyPair.getXdrPublicKey();
        assertEquals(publicKey, PublicFactory.fromBase64(keyPair.getPublicKey()));
    }

}