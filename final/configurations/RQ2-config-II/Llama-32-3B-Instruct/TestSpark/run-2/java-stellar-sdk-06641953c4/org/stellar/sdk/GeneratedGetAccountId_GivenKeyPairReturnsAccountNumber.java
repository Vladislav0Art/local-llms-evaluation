package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedGetAccountId_GivenKeyPairReturnsAccountNumber {

    @Test
    public void getAccountId_GivenKeyPairReturnsAccountNumber() {
        String accountId = "account123";
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(accountId));
        assertEquals(accountId, keyPair.getAccountId());
    }

}