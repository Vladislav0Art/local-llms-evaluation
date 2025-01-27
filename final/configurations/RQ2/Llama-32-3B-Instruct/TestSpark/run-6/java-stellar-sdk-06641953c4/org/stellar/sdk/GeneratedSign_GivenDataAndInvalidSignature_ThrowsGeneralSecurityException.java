package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedSign_GivenDataAndInvalidSignature_ThrowsGeneralSecurityException {

    @Test
    public void sign_GivenDataAndInvalidSignature_ThrowsGeneralSecurityException() throws Exception {
        byte[] data = new byte[32];
        Arrays.fill(data, (byte) 0);
        KeyPair keyPair = generateRandomKeyPair();
        try {
            keyPair.sign(data);
            fail("Expected GeneralSecurityException");
        } catch (GeneralSecurityException e) {
        }
    }

}