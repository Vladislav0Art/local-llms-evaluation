package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerify ReturnsCorrectVerificationResult {

    @Test
    public void verify

    ReturnsCorrectVerificationResult() throws GeneralSecurityException {
        byte[] data = "my_data".getBytes();
        byte[] signature = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed("my_seed".getBytes());
        boolean expectedVerificationResult = true;
        boolean result = keyPair.verify(data, signature);
        assertTrue(result == expectedVerificationResult);
    }

}