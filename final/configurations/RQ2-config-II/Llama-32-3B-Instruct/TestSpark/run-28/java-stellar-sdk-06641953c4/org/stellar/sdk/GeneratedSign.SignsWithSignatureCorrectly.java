package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSign.

SignsWithSignatureCorrectly {

    @Test
    public void sign.SignsWithSignatureCorrectly() throws GeneralSecurityException {
        byte[] data = "Hello World".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed("1234567890".toCharArray());
        byte[] signature = keyPair.sign(data);
        assertTrue(new Signature(signature).verify(data));
    }

}