package org.stellar.sdk;

public class GeneratedGetSecretSeedsecretSeedArrayTest {

    @Test
    public void getSecretSeedsecretSeedArrayTest() {
        char[] seed = "0123456789".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getSecretSeed());
    }

}