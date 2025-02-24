package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() throws Exception {
        String accountId = "abc";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(keyPair.getAccountId(), accountId);
    }

}