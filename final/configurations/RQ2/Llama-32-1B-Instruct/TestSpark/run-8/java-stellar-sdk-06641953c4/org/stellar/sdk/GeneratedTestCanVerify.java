package org.stellar.sdk;

public class GeneratedTestCanVerify {

    @Test
    public void testCanVerify() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        boolean canVerify = publicKey.verify("some_signature", Arrays.copyOfRange(new byte[]{1, 2, 3}, 0, 3));

        // Assert
        Preconditions.checkArgument(canVerify, "KeyPair should be able to verify");
    }

}