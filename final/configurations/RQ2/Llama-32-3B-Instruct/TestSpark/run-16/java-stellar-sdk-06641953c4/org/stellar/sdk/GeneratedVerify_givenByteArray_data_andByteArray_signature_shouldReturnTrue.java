package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedVerify_givenByteArray_data_andByteArray_signature_shouldReturnTrue {

    @Test
    public void verify_givenByteArray_data_andByteArray_signature_shouldReturnTrue() throws GeneralSecurityException {
        byte[] data = "random_data".getBytes();
        KeyPair key_pair = new KeyPair(new EdDSAPublicKey());
        byte[] signature = new byte[64];
        Arrays.fill(signature, (byte) 0x00);
        assertTrue(key_pair.verify(data, signature));
    }

}