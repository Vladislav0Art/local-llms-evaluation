package org.stellar.sdk;

public class GeneratedCreateKeyPairFromSecretSeedsecretSeedStringTest {

    @Test
    public void createKeyPairFromSecretSeedsecretSeedStringTest() {
        String seed = "0123456789";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}