package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountId_givenString_accountId_shouldReturnNull {

    @Test
    public void fromAccountId_givenString_accountId_shouldReturnNull() {
        String accountId = "invalid_account_id";
        assertNull(KeyPair.fromAccountId(accountId));
    }

}