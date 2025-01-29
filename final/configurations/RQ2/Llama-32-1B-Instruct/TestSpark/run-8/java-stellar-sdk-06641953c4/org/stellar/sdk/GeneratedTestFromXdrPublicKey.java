package org.stellar.sdk;

public class GeneratedTestFromXdrPublicKey {

    @Test
    public void testFromXdrPublicKey() {
        // Arrange
        String secretSeed = "some_secret_seed";
        PublicKey xdrPublicKey = Keypair.fromXdrPublicKey(new PublicKey(XdrDataOutputStream.newInputStream(new ByteArrayOutputStream("some_xdr_public_key"))));

        // Act
        KeyPair keyPair = KeyPair.fromXdrPublicKey(xdrPublicKey);

        // Assert
        Preconditions.checkArgument(keyPair != null, "KeyPair should be created from an XDR public key");
    }

}