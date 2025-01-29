package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = {1, 2, 3};
        KeyPair key = new KeyPair(fromSecretSeed(secretSeed));
        assertTrue(key.getSecretSeed().length == secretSeed.length);
        Arrays.equals(secretSeed, key.getSecretSeed());
    }

}