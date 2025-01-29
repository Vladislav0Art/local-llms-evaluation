package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        // Mocking API Response
        String signingKeySeed = "JZLw3R6jXkSv4aKgF2Wu6V0QcYqzU8n9f3pB";

        // Initialize mock classes and methods
        EdDSAPublicKeys.XdrPublicKeys xdrPublicKeys = new EdDSAPublicKeys.XdrPublicKeys();
        XdrPublicKey publicKey = xdrPublicKeys.getXdrPublicKey(signingKeySeed);

        // Test function to get public key
        privateAccount = new PrivateAccount();

        assertEquals(publicKey.getPublicKey(), xdrPublicKeys.getXdrPublicKey(signingKeySeed));
    }

}