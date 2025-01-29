package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        char[] secretSeed = generateRandomSecretSeed();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(secretSeed));
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(secretSeed.length, keyPair.getSecretSeed().length, "secret seed length");
    }

}