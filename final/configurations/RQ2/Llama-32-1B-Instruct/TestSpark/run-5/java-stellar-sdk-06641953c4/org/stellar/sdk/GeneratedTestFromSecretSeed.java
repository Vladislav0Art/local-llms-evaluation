package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        byte[] secretSeed = "secret seed".getBytes();
        KeyPair keyPair = org.stellar.sdk.KeyPair.fromSecretSeed(secretSeed);
        Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
        assertEquals(secretSeed.length, keyPair.getSecretSeed().length, "KeyPair should have the correct length for secret seed");
    }

}