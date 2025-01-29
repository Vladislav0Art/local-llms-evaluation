package org.stellar.sdk;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        // Arrange
        char[] seed = new byte[32];
        String seedStr = "secret seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Act
        EdDSAPublicKey publicKey = keyPair.getPublicKey();

        // Assert
        Preconditions.checkNotNull(publicKey, "keyPair should not be null");
    }

}