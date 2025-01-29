package org.stellar.sdk;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        // Arrange
        String accountId = "someAccountNumber";

        // Act
        char[] secretSeed = KeyPair.fromAccountId(accountId).getSecretSeed();

        // Assert
        Preconditions.checkThat(secretSeed, checkArrayIsEqual('x', 'y'));
    }

}