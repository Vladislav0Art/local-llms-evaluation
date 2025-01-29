package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        // Arrange
        String accountId = "some-account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Act
        String expectedValue = accountId;

        // Assert
        assertEquals(expectedValue, keyPair.getAccountId());
    }

}