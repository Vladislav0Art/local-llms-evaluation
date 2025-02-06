package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.security.MessageDigest;

public class GeneratedFromAccountId_ReturnsValidKeyPair_WithUniqueAccountId {

    @Test
    public void fromAccountId_ReturnsValidKeyPair_WithUniqueAccountId() {
        String accountId = "account-id-123";
        assertTrue(KeyPair.fromAccountId(accountId).getAccountId().equals(accountId));
    }

}