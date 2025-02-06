package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerify_DoesNotSupportVerificationWithNullSignature {

    @Test
    public void verify_DoesNotSupportVerificationWithNullSignature() {
        byte[] data = new byte[]{1, 2, 3};
        assertTrue(KeyPair.of(data).verify(data, null));
        try {
            KeyPair.of(data).verify(data, null);
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
            // Expected
        }
    }

}