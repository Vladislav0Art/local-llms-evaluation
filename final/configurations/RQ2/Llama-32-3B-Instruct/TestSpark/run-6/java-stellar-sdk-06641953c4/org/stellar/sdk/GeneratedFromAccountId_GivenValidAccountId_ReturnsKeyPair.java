package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromAccountId_GivenValidAccountId_ReturnsKeyPair {

    @Test
    public void fromAccountId_GivenValidAccountId_ReturnsKeyPair() {
        String accountId = "account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair);
    }

}