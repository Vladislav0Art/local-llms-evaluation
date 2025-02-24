package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(null); // Create an instance of KeyPair
        boolean result = keyPair.canSign(); // Call the canSign method
        assertTrue(result); // Check if the result is true
    }

}