package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountId_withExistingAccountID_ReturnsNonNullKeyPair {

    @Test
    public void fromAccountId_withExistingAccountID_ReturnsNonNullKeyPair() {
        // Arrange
        String accountId = "existing-account-id";

        // Act and Assert
        assertNotEquals(null, KeyPair.fromAccountId(accountId));
    }

}