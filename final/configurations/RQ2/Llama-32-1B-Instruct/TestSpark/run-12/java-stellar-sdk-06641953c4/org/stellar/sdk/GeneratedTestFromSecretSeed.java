package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        char[] secretSeed = "1234567890abcdef";
        KeyPair key = KeyPair.fromSecretSeed(secretSeed);
        assertTrue(key.getSecretSeed().length == secretSeed.length);
        assertEquals(secretSeed, key.getSecretSeed());
    }

}