package org.stellar.sdk;

public class GeneratedTestKeyPairFromSecretSeed {

    @Test
    public void testKeyPairFromSecretSeed() {
        // Arrange
        byte[] secretSeed = "valid_seed".getBytes();

        // Act and Assert
        assertThrows(NullPointerException.class, () -> Keypair.fromSecretSeed(null));
        assertNotNull(Keypair.fromSecretSeed(secretSeed));
    }

}