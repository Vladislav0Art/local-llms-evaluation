package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void testGetPublicAccount() {
        // Mocking API Response
        String accountName = "test-account";
        String accountId = "12345";

        // Initialize mock classes and methods
        PublicAccount publicAccount = new PublicAccount();
        publicAccount.setAccountId(accountId);
        publicAccount.setAccountName(accountName);

        // Test function to get public account
        publicAccount = new PublicAccount();
        assertEquals(publicAccount.getAccountId(), accountId);
        assertEquals(publicAccount.getAccountName(), accountName);

        // Mocking API Response for Public Account (optional)
    }

    @Test
    public void testGetPrivateAccount() {
        // Mocking API Response
        String accountName = "test-account";
        String accountId = "67890";

        // Initialize mock classes and methods
        PrivateAccount privateAccount = new PrivateAccount();
        privateAccount.setAccountId(accountId);
        privateAccount.setAccountName(accountName);

        // Test function to get public account
        publicAccount = new PublicAccount();
        assertEquals(privateAccount.getAccountId(), accountId);
        assertEquals(privateAccount.getAccountName(), accountName);

        // Mocking API Response for Private Account (optional)
    }

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