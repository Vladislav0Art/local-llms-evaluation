package org.stellar.sdk;

public class GeneratedTestGetSignatureHint {

    @Test
    public void testGetSignatureHint() {
        // Arrange
        String secretSeed = "some_secret_seed";
        EdDSAPublicKey publicKey = Keypair.fromPublicKey(secretSeed.getBytes());

        // Act
        SignatureHint signatureHint = publicKey.getSignatureHint();

        // Assert
        Preconditions.checkArgument(signatureHint != null, "KeyPair should have a signature hint");
    }

}