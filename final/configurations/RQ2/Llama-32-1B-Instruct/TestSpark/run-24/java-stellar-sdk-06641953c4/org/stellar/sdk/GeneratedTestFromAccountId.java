package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        // Arrange
        String accountId = "some-account-id";

        // Act
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Assert
        assertEquals(accountId, keyPair.getAccountId());
    }

}