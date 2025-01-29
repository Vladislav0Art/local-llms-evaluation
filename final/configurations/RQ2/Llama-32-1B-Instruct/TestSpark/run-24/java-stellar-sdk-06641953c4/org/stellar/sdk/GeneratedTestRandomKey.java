package org.stellar.sdk;

public class GeneratedTestRandomKey {

    @Test
    public void testRandomKey() {
        // Arrange
        KeyPair keyPair = KeyPair.random();

        // Act
        String privateKey = Arrays.toString(keyPair.getSecretSeed());

        // Assert
        assertEquals(privateKey, "JZLw3R6jXkSv4aKgF2Wu6V0QcYqzU8n9f3pB");
    }

}