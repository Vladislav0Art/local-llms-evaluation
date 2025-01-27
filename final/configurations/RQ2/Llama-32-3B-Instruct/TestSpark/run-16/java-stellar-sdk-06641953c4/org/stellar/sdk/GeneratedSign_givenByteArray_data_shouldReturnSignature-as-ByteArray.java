package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSign_givenByteArray_data_shouldReturnSignature-as-

ByteArray {

    @Test
    public void sign_givenByteArray_data_shouldReturnSignature -as - ByteArray() throws GeneralSecurityException {
        byte[] data = "random_data".getBytes();
        KeyPair key_pair = new KeyPair(new EdDSAPublicKey());
        byte[] signature = key_pair.sign(data);
        assertNotNull(signature);
    }

}