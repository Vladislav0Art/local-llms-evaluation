package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountId ReturnsInstanceWithCorrectXdrPublicKey {

    @Test
    public void fromAccountId

    ReturnsInstanceWithCorrectXdrPublicKey() throws IOException {
        String accountId = "account_id";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        assertNotNull(keyPair.getXdrPublicKey());
    }

}