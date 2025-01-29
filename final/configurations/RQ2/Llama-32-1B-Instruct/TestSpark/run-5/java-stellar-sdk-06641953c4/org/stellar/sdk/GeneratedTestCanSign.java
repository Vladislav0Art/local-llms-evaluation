package org.stellar.sdk;

public class GeneratedTestCanSign {

    @Test
    public void testCanSign() {
        String secretSeed = "secret seed";
        KeyPair keyPair = new org.stellar.sdk.KeyPair(KeyPair.fromSecretSeed(secretSeed));
        Preconditions.checkNotNull(keyPair, "Expected a valid KeyPair instance");
        assertTrue(keyPair.canSign(), "KeyPair should be able to sign");
    }

}