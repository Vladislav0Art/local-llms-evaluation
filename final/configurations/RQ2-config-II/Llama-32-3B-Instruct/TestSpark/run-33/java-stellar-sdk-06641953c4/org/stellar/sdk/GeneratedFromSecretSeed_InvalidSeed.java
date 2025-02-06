package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_InvalidSeed {

    @Test
    public void fromSecretSeed_InvalidSeed() {
        byte[] seed = new byte[]{1, 2, 3};
        assertTrue(KeyPair.fromSecretSeed(seed).canSign());
        try {
            KeyPair.of(seed);
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
            // Expected
        }
    }

}