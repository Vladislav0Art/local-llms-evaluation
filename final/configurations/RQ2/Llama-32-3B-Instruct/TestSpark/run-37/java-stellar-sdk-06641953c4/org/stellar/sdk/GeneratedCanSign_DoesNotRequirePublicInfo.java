package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCanSign_DoesNotRequirePublicInfo {

    @Test
    public void canSign_DoesNotRequirePublicInfo() {
        // Arrange and Act
        KeyPair keyPair = new KeyPair(null);
        boolean result = keyPair.canSign();

        // Assert
        assertTrue(result);
    }

}