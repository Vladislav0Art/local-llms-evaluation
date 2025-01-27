package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromAccountId_ReturnsNull {

    @Test
    public void fromAccountId_ReturnsNull() {
        // Arrange
        String accountId = "account_id";

        // Act and Assert
        assertNull(KeyPair.fromAccountId(accountId));
    }

}