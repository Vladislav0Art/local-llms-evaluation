package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountId_CanCreateKeyPairWithAccountId {

    @Test
    public void fromAccountId_CanCreateKeyPairWithAccountId() {
        String accountId = "accountId";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}