package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCanSign_BeforeSigning {

    @Test
    public void canSign_BeforeSigning() {
        // Arrange and Act
        KeyPair keyPair = new KeyPair(null);
        boolean result = keyPair.canSign();

        // Assert
        assertTrue(result);
    }

}