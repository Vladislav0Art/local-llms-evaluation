package org.stellar.sdk;

public class GeneratedCreateKeyPairFromSecretSeedsecretSeedArrayTest {

    @Test
    public void createKeyPairFromSecretSeedsecretSeedArrayTest() {
        char[] seed = "0123456789".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}