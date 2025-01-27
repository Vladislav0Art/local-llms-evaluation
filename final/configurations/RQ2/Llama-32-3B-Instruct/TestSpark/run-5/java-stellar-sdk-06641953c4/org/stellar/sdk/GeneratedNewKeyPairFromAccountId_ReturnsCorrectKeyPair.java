package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedNewKeyPairFromAccountId_ReturnsCorrectKeyPair {

    @Test
    public void newKeyPairFromAccountId_ReturnsCorrectKeyPair() throws GeneralSecurityException {
        String accountId = "some_account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertEquals(accountId, keyPair.getAccountId());
    }

}