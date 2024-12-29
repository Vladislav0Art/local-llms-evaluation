package org.stellar.sdk;

public class GeneratedFromSecretSeedShouldReturnInstance_WhenSeedIsValid {

    @Test
    public void fromSecretSeedShouldReturnInstance_WhenSeedIsValid() {
        char[] seed = "valid_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}