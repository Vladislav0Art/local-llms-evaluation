package org.stellar.sdk;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        // Test method "getAccountId"
        // Expected result is a non-empty string
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        assertFalse(accountId.isEmpty());
    }

}