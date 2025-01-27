package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSignThrowsExceptionWhenProvidedWithInvalidDataOrSignature {

    @Test
    public void signThrowsExceptionWhenProvidedWithInvalidDataOrSignature() {
        byte[] data = "1234567890".getBytes();
        byte[] signature = new byte[1];
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey());
        assertThrows(GeneralSecurityException.class, () -> keyPair.sign(data, signature));
    }

}