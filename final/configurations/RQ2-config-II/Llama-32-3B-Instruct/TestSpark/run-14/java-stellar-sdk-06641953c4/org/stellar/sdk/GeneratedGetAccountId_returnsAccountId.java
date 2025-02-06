package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetAccountId_returnsAccountId {

    @Test
    public void getAccountId_returnsAccountId() {
        String accountId = "test";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}