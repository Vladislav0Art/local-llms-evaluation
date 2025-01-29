package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_1_2 {

    @Test
    public void testFromSecretSeed_1_2() {
        char[] seed = "secret-seed-1-2".toCharArray();
        KeyPair key = KeyPair.fromSecretSeed(seed);
        Preconditions.assertSame("eddsa", key.getTypes());
    }

}