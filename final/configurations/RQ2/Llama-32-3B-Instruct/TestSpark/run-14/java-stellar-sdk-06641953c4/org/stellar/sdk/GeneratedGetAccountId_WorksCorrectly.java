package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetAccountId_WorksCorrectly {

    @Test
    public void getAccountId_WorksCorrectly() {
        // Arrange
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());

        // Act and Assert
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);

        assertEquals(8, accountId.length());
    }

}