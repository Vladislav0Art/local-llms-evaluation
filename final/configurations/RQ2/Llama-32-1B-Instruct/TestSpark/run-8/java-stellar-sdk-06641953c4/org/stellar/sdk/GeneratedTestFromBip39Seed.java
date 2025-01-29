package org.stellar.sdk;

public class GeneratedTestFromBip39Seed {

    @Test
    public void testFromBip39Seed() {
        // Arrange
        byte[] bip39Seed = "some_bip39_seed".getBytes();
        KeyPair keyPair = Keypair.fromBip39Seed(bip39Seed, 0);

        // Act
        String publicKeyBytes = Arrays.toString(keyPair.getPublicKey());

        // Assert
        Preconditions.checkArgument(publicKeyBytes != null, "KeyPair should have a public key");
    }

}