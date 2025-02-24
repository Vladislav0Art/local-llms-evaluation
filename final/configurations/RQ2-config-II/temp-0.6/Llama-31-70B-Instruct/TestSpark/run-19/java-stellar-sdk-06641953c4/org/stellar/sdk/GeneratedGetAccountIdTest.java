package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(null); // Create an instance of KeyPair
        String result = keyPair.getAccountId(); // Call the getAccountId method
        assertEquals("expectedAccountId", result); // Check if the result is equal to the expected value
    }

}