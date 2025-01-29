package org.stellar.sdk;

public class GeneratedTestGetSignatureHint {

    @Test
    public void testGetSignatureHint() {
        // Arrange
        SignatureHint expectedHint = "some-signature-hint";
        KeyPair keyPair = KeyPair.fromSigningKey(new EdDSAPrivateKeySpec("some-signing-key"));

        // Act
        SignatureHint actualHint = keyPair.getSignatureHint();

        // Assert
        assertEquals(expectedHint, actualHint);
    }

}