package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromAccountId_ValidInput_ReturnsInstance {

    @Test
    public void fromAccountId_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        String accountId = "account-id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertEquals(accountId, keyPair.getAccountId());
    }

}