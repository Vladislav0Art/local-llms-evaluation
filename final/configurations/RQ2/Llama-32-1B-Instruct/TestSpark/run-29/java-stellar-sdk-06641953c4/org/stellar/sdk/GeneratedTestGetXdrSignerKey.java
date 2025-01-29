package org.stellar.sdk;

public class GeneratedTestGetXdrSignerKey {

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
    public void testGetXdrSignerKey() {
        // Arrange
        byte[] seed = "mock_seed".getBytes();
        EdDSAEngine eddsaEngine = new EdDSAEngine();
        MockKeyPairGenerator mockKeyPairGenerator = new MockKeyPairGenerator(seed);

        // Act
        SignerKey signerKey = keyPair.getXdrSignerKey();

        // Assert
        notNull(signerKey, "Mocked xdr signer key");
    }

}