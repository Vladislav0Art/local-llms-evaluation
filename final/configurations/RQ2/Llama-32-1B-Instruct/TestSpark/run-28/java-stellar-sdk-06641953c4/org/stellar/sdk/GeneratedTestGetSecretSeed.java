package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        // Arrange
        char[] seed = new byte[32];
        String seedStr = "secret seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Act
        char[] getSecretSeed = keyPair.getSecretSeed();

        // Assert
        Preconditions.checkNotNull(getSecretSeed, "keyPair should not be null");
    }

}