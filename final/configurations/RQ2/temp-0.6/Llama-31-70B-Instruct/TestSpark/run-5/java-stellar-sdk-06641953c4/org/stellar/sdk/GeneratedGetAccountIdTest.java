package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(null);
        String accountId = keyPair.getAccountId();
        assertNotNull(accountId);
    }

}