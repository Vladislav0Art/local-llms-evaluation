package org.stellar.sdk;

public class GeneratedFromSecretSeedString_test {

    @Test
    public void fromSecretSeedString_test() {
        String seed = "test";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}