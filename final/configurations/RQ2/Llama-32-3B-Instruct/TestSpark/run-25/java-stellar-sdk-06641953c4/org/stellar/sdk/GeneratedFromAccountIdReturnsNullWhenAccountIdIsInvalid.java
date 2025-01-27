package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountIdReturnsNullWhenAccountIdIsInvalid {

    @Test
    public void fromAccountIdReturnsNullWhenAccountIdIsInvalid() {
        String accountId = "";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNull(keyPair);
    }

}