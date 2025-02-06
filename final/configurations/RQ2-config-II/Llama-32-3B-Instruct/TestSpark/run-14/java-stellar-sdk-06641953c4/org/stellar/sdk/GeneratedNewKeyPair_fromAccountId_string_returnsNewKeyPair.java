package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedNewKeyPair_fromAccountId_string_returnsNewKeyPair {

    @Test
    public void newKeyPair_fromAccountId_string_returnsNewKeyPair() {
        String accountId = "test";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}