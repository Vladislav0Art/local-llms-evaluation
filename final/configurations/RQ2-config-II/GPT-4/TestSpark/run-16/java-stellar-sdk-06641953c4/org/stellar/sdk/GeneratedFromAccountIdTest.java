package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        KeyPair keyPair = KeyPair.random();
        String accountId = keyPair.getAccountId();
        assertNotNull(KeyPair.fromAccountId(accountId));
    }

}