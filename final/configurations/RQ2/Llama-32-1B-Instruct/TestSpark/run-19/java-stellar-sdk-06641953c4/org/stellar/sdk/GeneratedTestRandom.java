package org.stellar.sdk;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        String secretSeed = generateRandomSecretSeed();
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(secretSeed.length, keyPair.getSecretSeed().length, "secret seed length");
    }

}