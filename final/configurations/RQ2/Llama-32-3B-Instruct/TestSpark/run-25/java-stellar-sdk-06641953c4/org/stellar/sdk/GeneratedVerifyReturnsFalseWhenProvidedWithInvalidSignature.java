package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerifyReturnsFalseWhenProvidedWithInvalidSignature {

    @Test
    public void verifyReturnsFalseWhenProvidedWithInvalidSignature() {
        byte[] data = "1234567890".getBytes();
        byte[] signature = new byte[1];
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        boolean result = keyPair.verify(data, signature);
        assertFalse(result);
    }

}