package org.stellar.sdk;

public class GeneratedTestKeyPairFromBytes {

    @Test
    public void testKeyPairFromBytes() {
        // Arrange
        byte[] secretSeed = "valid_seed".getBytes();

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Keypair.fromSecretSeed(null));
        assertNotNull(Keypair.fromSecretSeed(secretSeed));
    }

}