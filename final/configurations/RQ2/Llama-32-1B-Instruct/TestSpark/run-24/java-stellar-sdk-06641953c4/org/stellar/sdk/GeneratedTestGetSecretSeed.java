package org.stellar.sdk;

public class GeneratedTestGetSecretSeed {

    @Test
    public void testGetSecretSeed() {
        // Arrange
        byte[] secretSeed = "JZLw3R6jXkSv4aKgF2Wu6V0QcYqzU8n9f3pB";
        KeyPair keyPair = KeyPair.fromSecretSeed(secretSeed);

        // Act
        String expectedValue = Arrays.toString(secretSeed);

        // Assert
        assertEquals(expectedValue, keyPair.getSecretSeed());
    }

}