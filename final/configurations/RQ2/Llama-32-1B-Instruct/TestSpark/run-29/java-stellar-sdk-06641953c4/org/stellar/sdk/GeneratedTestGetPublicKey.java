package org.stellar.sdk;

public class GeneratedTestGetPublicKey {

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
    public void testGetPublicKey() {
        // Arrange
        byte[] seed = "mock_seed".getBytes();
        EdDSAEngine eddsaEngine = new EdDSAEngine();
        MockKeyPairGenerator mockKeyPairGenerator = new MockKeyPairGenerator(seed);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Act
        PublicKey publicKey = keyPair.getPublicKey();

        // Assert
        notNull(publicKey, "Mocked public key");
    }

}