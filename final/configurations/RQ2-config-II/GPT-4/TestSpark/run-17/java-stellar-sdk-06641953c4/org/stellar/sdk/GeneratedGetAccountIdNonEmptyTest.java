package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.SignatureHint;

import static org.junit.Assert.*;

public class GeneratedGetAccountIdNonEmptyTest {

    @Test
    public void getAccountIdNonEmptyTest() {
        String accountId = KeyPair.random().getAccountId();
        assertNotNull(accountId);
    }

}