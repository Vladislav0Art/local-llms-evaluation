package org.stellar.sdk;

public class GeneratedTestSign {

    @Test
    public void testSign() {
        // Arrange
        char[] seed = new byte[32];
        String seedStr = "secret seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        byte[] data = new byte[32];
        SignerKey signerKey = new EdDSAPublicKey();
        SignatureHint signatureHint = new EdDSAPrivateKeySpec(seed);
        byte[] publicKey = new byte[32];
        keyPair.getXdrPublicKey().getEncoded(publicKey);

        // Act
        byte[] signedData = keyPair.sign(data, signerKey, signatureHint);

        // Assert
        Preconditions.checkNotNull(signedData, "signedData should not be null");
    }

}