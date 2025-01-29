package org.stellar.sdk;

public class GeneratedTestFromSigningKey {

    @Test
    public void testFromSigningKey() {
        // Arrange
        byte[] signingKeySeed = "JZLw3R6jXkSv4aKgF2Wu6V0QcYqzU8n9f3pB";
        EdDSAPrivateKeySpec privateKeySpec = new EdDSAPrivateKeySpec(signingKeySeed);
        KeyPair keyPair = KeyPair.fromSigningKey(privateKeySpec);

        // Act
        String expectedValue = "some-signing-key";

        // Assert
        assertEquals(expectedValue, keyPair.getSecretSeed());
    }

}