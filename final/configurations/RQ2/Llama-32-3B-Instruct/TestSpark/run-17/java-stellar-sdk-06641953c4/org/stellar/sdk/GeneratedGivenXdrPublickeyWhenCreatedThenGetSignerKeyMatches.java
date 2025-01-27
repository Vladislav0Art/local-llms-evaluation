package org.stellar.sdk;

public class GeneratedGivenXdrPublickeyWhenCreatedThenGetSignerKeyMatches {

    @Test
    public void givenXdrPublickeyWhenCreatedThenGetSignerKeyMatches() {
        KeyPair keyPair = KeyPair.fromXdrPublicKey(PublicKey randomPublicKey());
        SignerKey signerKey = new SignerKey(keyPair.getSignerKey());
        assertEquals(signerKey, keyPair.getXdrSignerKey());
    }

}