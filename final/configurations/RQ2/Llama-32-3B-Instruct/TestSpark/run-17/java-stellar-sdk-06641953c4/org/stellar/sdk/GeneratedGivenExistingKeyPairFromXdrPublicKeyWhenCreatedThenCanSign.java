package org.stellar.sdk;

public class GeneratedGivenExistingKeyPairFromXdrPublicKeyWhenCreatedThenCanSign {

    @Test
    public void givenExistingKeyPairFromXdrPublicKeyWhenCreatedThenCanSign() {
        KeyPair keyPair = KeyPair.fromXdrPublicKey(PublicKey randomPublicKey());
        assertTrue(keyPair.canSign());
    }

}