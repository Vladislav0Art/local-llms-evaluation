package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null); // Create an instance of KeyPair
        byte[] result = keyPair.getPublicKey(); // Call the getPublicKey method
        assertEquals(32, result.length); // Check if the result has the expected length
    }

}