package org.stellar.sdk;

import org.stellar.sdk.KeyPair;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = new KeyPair(null, null);
        String accountId = keyPair.getAccountId();
        assertEquals("Test", accountId);
    }

}