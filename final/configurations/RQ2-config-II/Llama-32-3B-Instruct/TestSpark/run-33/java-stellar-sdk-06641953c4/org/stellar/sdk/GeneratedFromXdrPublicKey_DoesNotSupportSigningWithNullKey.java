package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromXdrPublicKey_DoesNotSupportSigningWithNullKey {

    @Test
    public void fromXdrPublicKey_DoesNotSupportSigningWithNullKey() {
        PublicKey key = new PublicKey();
        assertTrue(KeyPair.fromXdrPublicKey(key).canSign());
        try {
            KeyPair.of(key);
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
            // Expected
        }
    }

}