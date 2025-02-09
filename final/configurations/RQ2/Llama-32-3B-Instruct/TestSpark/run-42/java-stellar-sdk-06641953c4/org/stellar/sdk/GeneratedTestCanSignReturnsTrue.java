package org.stellar.sdk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestCanSignReturnsTrue {

    @Test
    public void testCanSignReturnsTrue() {
        // Arrange and Act
        boolean result = KeyPair.canSign("message", "signature");

        // Assert
        assertTrue(result);
    }

}