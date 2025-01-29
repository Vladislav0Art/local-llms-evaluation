package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetSigningKeyId {

    @Test
    public void testGetSigningKeyId() {
        // Mocking API Response
        String signingKeySeed = "JZLw3R6jXkSv4aKgF2Wu6V0QcYqzU8n9f3pB";

        // Initialize mock classes and methods
        EdDSAPrivateKeySpec privateKeySpec = new EdDSAPrivateKeySpec(signingKeySeed);
        PrivateAccount privateAccount = new PrivateAccount();

        // Test function to get signing key id
        publicAccount = new PublicAccount();
        assertEquals(privateAccount.getSigningKeyId(), privateKeySpec.getPrivateKeyId());
    }

}