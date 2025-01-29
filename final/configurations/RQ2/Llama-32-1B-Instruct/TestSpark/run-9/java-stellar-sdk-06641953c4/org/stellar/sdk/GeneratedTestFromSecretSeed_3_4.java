package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_3_4 {

    @Test
    public void testFromSecretSeed_3_4() {
        String seed = "secret-seed-3-4".toByteArray();
        KeyPair key = KeyPair.fromSecretSeed(seed);
        Preconditions.assertTrue(key.canSign());
    }

}