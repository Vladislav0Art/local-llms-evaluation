package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedVerify_byteArray_bytes_returnsBoolean {

    @Test
    public void verify_byteArray_bytes_returnsBoolean() throws IOException, GeneralSecurityException {
        byte[] data = "data".getBytes();
        byte[] signature = "signature".getBytes();
        boolean result = KeyPair.fromSecretSeed("secret".toCharArray()).verify(data, signature);
        assertTrue(result);
    }

}