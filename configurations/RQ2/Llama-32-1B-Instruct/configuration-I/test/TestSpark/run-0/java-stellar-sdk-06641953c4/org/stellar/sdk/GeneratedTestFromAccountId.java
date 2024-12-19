package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        String accountId = "some-account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertEquals(KeyPair.class, keyPair.getClass());
    }

}