package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSign_DoesntVerifySignature {

    @Test
    public void sign_DoesntVerifySignature() {
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature1 = new byte[]{4, 5, 6};
        byte[] signature2 = new byte[]{7, 8, 9};

        assertTrue(KeyPair.of(data).verify(data, signature1));
        assertFalse(KeyPair.of(data).verify(data, signature2));
    }

}