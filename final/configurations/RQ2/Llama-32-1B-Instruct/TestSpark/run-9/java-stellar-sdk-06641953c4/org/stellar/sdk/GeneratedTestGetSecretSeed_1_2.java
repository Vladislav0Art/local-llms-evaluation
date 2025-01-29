package org.stellar.sdk;

public class GeneratedTestGetSecretSeed_1_2 {

    @Test
    public void testGetSecretSeed_1_2() {
        KeyPair key = new KeyPair(new EdDSAPublicKey("xpub-key"));
        char[] secretSeed = key.getSecretSeed();
        Preconditions.assertArrayEquals("secret-seed-1-2", secretSeed);
    }

}