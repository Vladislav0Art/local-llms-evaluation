package org.stellar.sdk;

public class GeneratedTestSign {

    @Test
    public void testSign() {
        // Arrange
        byte[] data = new byte[]{1, 2};

        // Act
        Signature signature = KeyPair.sign(data);

        // Assert
        Preconditions.checkThat(signature, isNotNull());
    }

}