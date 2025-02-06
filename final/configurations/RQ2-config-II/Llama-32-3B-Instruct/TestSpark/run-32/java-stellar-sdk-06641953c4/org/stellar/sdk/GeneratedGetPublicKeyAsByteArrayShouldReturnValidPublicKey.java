package org.stellar.sdk;

public class GeneratedGetPublicKeyAsByteArrayShouldReturnValidPublicKey {

    @Test
    public void getPublicKeyAsByteArrayShouldReturnValidPublicKey() {
        byte[] publicKey = ...;
        assertEquals(publicKey, keyPair.getPublicKey());
    }

}