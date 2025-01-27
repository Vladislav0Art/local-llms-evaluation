package org.stellar.sdk;

public class GeneratedGivenRandomPublickeyWhenCreatedThenGetPublicKeyMatches {

    @Test
    public void givenRandomPublickeyWhenCreatedThenGetPublicKeyMatches() {
        KeyPair keyPair = KeyPair.random();
        PublicKey publicKey = new PublicKey(keyPair.getPublicKey());
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}