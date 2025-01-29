package org.stellar.sdk;

public class GeneratedTestFromSecretSeed_5_6 {

    @Test
    public void testFromSecretSeed_5_6() {
        byte[] seed = "secret-seed-5-6".toByteArray();
        KeyPair key = KeyPair.fromSecretSeed(seed);
        Preconditions.assertSame("eddsa", key.getTypes());
    }

}