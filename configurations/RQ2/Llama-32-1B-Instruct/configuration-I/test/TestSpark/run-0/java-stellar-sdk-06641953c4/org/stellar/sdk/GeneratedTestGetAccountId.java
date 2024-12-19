package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        String accountId = "some-account-id";
        KeyPair keyPair = new KeyPair(KeyPair.fromAccountId(accountId));
        assertNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

}