package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        // Arrange
        String accountId = "account id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Act
        String getAccountId = keyPair.getAccountId();

        // Assert
        Preconditions.checkNotNull(getAccountId, "keyPair should not be null");
    }

}