package org.stellar.sdk;

public class GeneratedGivenRandomSigningKeyWhenCreatedThenGetPublickcyMatches {

    @Test
    public void givenRandomSigningKeyWhenCreatedThenGetPublickcyMatches() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = new PublicKey(keyPair.getPublicKey());
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}