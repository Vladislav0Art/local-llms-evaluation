package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        String value = keyPair.getAccountId();

        // Assert
        assertEquals("", value);
    }

}