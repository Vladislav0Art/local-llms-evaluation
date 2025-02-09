package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromAccountId_CanExtractAccountIdCorrectly {

    @Test
    public void fromAccountId_CanExtractAccountIdCorrectly() {
        // Arrange
        String accountId = "my_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);

        // Act and Assert
        assertEquals(accountId, keyPair.getAccountId());
    }

}