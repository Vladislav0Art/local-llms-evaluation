package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromSecretSeed_GivenInvalidSeed_ThrowsGeneralSecurityException {

    @Test
    public void fromSecretSeed_GivenInvalidSeed_ThrowsGeneralSecurityException() throws Exception {
        byte[] seed = new byte[33];
        Arrays.fill(seed, (byte) 0);
        try {
            KeyPair.fromSecretSeed(seed);
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
        }
    }

}