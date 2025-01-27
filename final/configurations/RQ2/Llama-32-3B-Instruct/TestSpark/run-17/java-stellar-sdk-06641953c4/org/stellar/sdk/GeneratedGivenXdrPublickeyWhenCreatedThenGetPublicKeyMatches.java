package org.stellar.sdk;

public class GeneratedGivenXdrPublickeyWhenCreatedThenGetPublicKeyMatches {

    @Test
    public void givenXdrPublickeyWhenCreatedThenGetPublicKeyMatches() {
        KeyPair keyPair = KeyPair.fromXdrPublicKey(PublicKey randomPublicKey());
        assertEquals(keyPair.getPublicKey(), randomPublicKey().getBytes());
    }

}