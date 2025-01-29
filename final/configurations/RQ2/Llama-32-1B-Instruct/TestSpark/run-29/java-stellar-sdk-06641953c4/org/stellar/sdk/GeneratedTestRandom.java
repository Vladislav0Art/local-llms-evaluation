package org.stellar.sdk;

public class GeneratedTestRandom {

    private EdDSAEngine eddsaEngine;
    private MockKeyPairGenerator mockKeyPairGenerator;

    @Mock
    public void testFromSecretSeed() {
        String seed = "mock_seed";
        byte[] secretSeed = "mock_secret_seed".getBytes();
        MockKeyPairGenerator mockKeyPairGenerator = new MockKeyPairGenerator(secretSeed);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        when(mockKeyPairGenerator.fromSecretSeed(anyString())).thenReturn(keyPair);
    }

    @Test
    public void testRandom() {
        // Arrange
        String seed = "mock_seed";
        byte[] secretSeed = "mock_secret_seed".getBytes();
        EdDSAEngine eddsaEngine = new EdDSAEngine();
        MockKeyPairGenerator mockKeyPairGenerator = new MockKeyPairGenerator(secretSeed);
        KeyPair keyPair = KeyPair.random();

        // Act
        KeyPair keyPair2 = KeyPair.fromSecretSeed(seed);

        // Assert
        notNull(keyPair, "Mocked random key pair");
        notNull(keyPair2, "Mocked seed for same key pair");
    }

}