package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedAccountIdTest {

    @Test
    public void accountIdTest() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
        assertEquals(keyPair.getAccountId(), "accountId");
    }

}