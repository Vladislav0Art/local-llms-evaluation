package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        // Arrange
        KeyPair keyPair = new KeyPair(null);

        // Act
        boolean value = keyPair.canSign();

        // Assert
        assertEquals(false, value);
    }

}