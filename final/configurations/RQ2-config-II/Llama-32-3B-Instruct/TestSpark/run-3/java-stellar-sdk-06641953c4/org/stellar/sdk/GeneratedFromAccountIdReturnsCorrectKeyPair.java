package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromAccountIdReturnsCorrectKeyPair {

    @Test
    public void fromAccountIdReturnsCorrectKeyPair() throws IOException {
        String accountId = "test_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}