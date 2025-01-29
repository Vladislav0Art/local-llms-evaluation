package org.stellar.sdk;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        // Arrange
        String accountId = "someAccountNumber";

        // Act
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Assert
        Preconditions.checkThat(keyPair.getAccountId(), isStringWithLength(2));
    }

}