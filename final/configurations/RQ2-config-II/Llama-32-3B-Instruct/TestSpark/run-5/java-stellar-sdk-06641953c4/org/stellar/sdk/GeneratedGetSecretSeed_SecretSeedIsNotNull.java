package org.stellar.sdk;

public class GeneratedGetSecretSeed_SecretSeedIsNotNull {

    @Test
    public void getSecretSeed_SecretSeedIsNotNull() throws Exception {
        char[] seed = "testseed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getSecretSeed());
    }

}