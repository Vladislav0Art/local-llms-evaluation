package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.SignatureException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedFromAccountIdWithValidAccountIdReturnsKeypair {

    @Test
    public void fromAccountIdWithValidAccountIdReturnsKeypair() throws Exception {
        String accountId = "account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}