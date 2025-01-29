package org.stellar.sdk;

public class GeneratedTestFromXdrSignerKey {

    @Test
    public void testFromXdrSignerKey() {
        // Arrange
        String secretSeed = "some_secret_seed";
        SignerKey signerKey = Keypair.fromXdrSignerKey(new SignerKey(XdrDataOutputStream.newInputStream(new ByteArrayOutputStream("some_xdr_signer_key"))));

        // Act
        KeyPair keyPair = KeyPair.fromXdrSignerKey(signerKey);

        // Assert
        Preconditions.checkArgument(keyPair != null, "KeyPair should be created from an XDR signer key");
    }

}