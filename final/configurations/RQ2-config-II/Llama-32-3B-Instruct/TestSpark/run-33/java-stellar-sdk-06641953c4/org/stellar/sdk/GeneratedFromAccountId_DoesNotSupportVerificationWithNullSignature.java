package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromAccountId_DoesNotSupportVerificationWithNullSignature {

    @Test
    public void fromAccountId_DoesNotSupportVerificationWithNullSignature() {
        String accountId = "account_id";
        assertTrue(KeyPair.fromAccountId(accountId).verify(new byte[]{1, 2, 3}, null));
        try {
            KeyPair.of(accountId).verify(null, null);
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
            // Expected
        }
    }

}