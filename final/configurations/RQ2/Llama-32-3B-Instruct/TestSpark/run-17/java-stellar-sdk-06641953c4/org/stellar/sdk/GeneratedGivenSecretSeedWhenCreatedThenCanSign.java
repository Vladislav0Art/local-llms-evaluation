package org.stellar.sdk;

public class GeneratedGivenSecretSeedWhenCreatedThenCanSign {

    @Test
    public void givenSecretSeedWhenCreatedThenCanSign() {
        char[] seed = "secret_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair.canSign());
    }

}