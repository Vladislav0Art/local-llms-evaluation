package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetAccountIdReturnsValidAccountId {

    @Test
    public void getAccountIdReturnsValidAccountId() {
        String accountId = "account123";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}