package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_String {

    @Test
    public void testFromSecretSeed_String() {
        String seed = "Test Seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}