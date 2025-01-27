package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSignDoesNotThrowExceptionWhenProvidedWithValidDataAndSignature {

    @Test
    public void signDoesNotThrowExceptionWhenProvidedWithValidDataAndSignature() {
        byte[] data = "1234567890".getBytes();
        byte[] signature = new byte[0];
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        try {
            keyPair.sign(data);
        } catch (GeneralSecurityException e) {
            fail("Expected no exception");
        }
    }

}