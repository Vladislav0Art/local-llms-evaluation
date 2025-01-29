package org.stellar.sdk;

public class GeneratedTestGenerateRandomSecretSeed {

    @Test
    public void testGenerateRandomSecretSeed() {
        byte[] secretSeed = generateRandomSecretSeed();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(secretSeed));
        Preconditions.checkNotNull(keyPair, "key pair is null");

        assertEquals(secretSeed.length, keyPair.getSecretSeed().length, "secret seed length");
    }

}