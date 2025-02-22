package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetAccountId {

    @Test
    public void testGetAccountId() {
        KeyPair keyPair = new KeyPair();
        String accountId = keyPair.getAccountId();
        assertEquals("expected accountId", accountId);
    }

}