package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetSigningKey {

    @Test
    public void testGetSigningKey() {
        // Mocking API Response
        String signingKeySeed = "JZLw3R6jXkSv4aKgF2Wu6V0QcYqzU8n9f3pB";

        // Initialize mock classes and methods
        EdDSAPrivateKeySpec privateKeySpec = new EdDSAPrivateKeySpec(signingKeySeed);
        PrivateAccount privateAccount = new PrivateAccount();

        // Test function to get signing key
        publicAccount = new PublicAccount();
        assertEquals(privateAccount.getSigningKeyId(), privateKeySpec.getPrivateKeyId());
    }

}