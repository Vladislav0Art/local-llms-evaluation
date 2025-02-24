package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        KeyPair keyPair = new KeyPair(null); // Create an instance of KeyPair
        char[] result = keyPair.getSecretSeed(); // Call the getSecretSeed method
        assertEquals(32, result.length); // Check if the result has the expected length
        assertTrue(Arrays.stream(result).allMatch(Character::isDigit)); // Check if all characters in the result are digits
    }

}