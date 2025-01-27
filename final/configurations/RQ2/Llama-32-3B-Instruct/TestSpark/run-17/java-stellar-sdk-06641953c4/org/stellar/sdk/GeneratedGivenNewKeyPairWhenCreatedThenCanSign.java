package org.stellar.sdk;

public class GeneratedGivenNewKeyPairWhenCreatedThenCanSign {

    @Test
    public void givenNewKeyPairWhenCreatedThenCanSign() {
        KeyPair keyPair = new KeyPair(KeyPair.random().getPublicKey());
        assertTrue(keyPair.canSign());
    }

}