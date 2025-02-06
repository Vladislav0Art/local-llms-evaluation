package org.stellar.sdk;

public class GeneratedGetSecretSeed_zeroLengthArray {

    @Test
    public void getSecretSeed_zeroLengthArray() {
        byte[] seed = new byte[0];
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

}