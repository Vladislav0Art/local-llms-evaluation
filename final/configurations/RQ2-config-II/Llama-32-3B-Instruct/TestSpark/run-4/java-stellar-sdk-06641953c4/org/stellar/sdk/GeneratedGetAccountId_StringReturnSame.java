package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetAccountId_StringReturnSame {

    @Test
    public void getAccountId_StringReturnSame() {
        String accountId = "accountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}