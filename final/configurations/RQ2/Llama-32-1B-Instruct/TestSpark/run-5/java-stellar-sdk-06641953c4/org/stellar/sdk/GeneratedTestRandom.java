package org.stellar.sdk;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        Random random = new Random();
        int count = 10;
        for (int i = 0; i < count; i++) {
            KeyPair keyPair = org.stellar.sdk.KeyPair.random();
            Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
            assertEquals(32, keyPair.getSecretSeed().length, "KeyPair should have the correct length for secret seed");
        }
    }

}