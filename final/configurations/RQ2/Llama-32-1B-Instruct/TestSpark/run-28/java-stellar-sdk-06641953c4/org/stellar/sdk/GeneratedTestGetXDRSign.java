package org.stellar.sdk;

public class GeneratedTestGetXDRSign {

    @Test
    public void testGetXDRSign() {
        // Arrange
        char[] seed = new byte[32];
        String seedStr = "secret seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        byte[] data = new byte[32];
        SignerKey signerKey = new EdDSAPublicKey();
        SignatureHint signatureHint = new EdDSAPrivateKeySpec(seed);
        keyPair.getXdrPublicKey().getEncoded(data);

        // Act
        byte[] signedData = keyPair.getSignerXDR(data, signerKey, signatureHint);

        // Assert
        Preconditions.checkNotNull(signedData, "signedData should not be null");
    }

}