package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSign_DoesNotSupportSigningWithNullKey {

    @Test
    public void sign_DoesNotSupportSigningWithNullKey() {
        assertTrue(KeyPair.of(null).sign(new byte[]{1, 2, 3}));
        try {
            KeyPair.of(null).sign(null);
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
            // Expected
        }
    }

}