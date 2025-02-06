package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;

public class GeneratedGetAccountId_returnsAccountId {

    @Test
    public void getAccountId_returnsAccountId() {
        byte[] seed = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        String accountId = keyPair.getAccountId();
        assertTrue(accountId != null && !accountId.isEmpty());
    }

}