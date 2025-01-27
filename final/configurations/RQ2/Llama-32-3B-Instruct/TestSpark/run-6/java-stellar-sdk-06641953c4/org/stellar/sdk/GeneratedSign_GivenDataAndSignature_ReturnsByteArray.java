package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedSign_GivenDataAndSignature_ReturnsByteArray {

    @Test
    public void sign_GivenDataAndSignature_ReturnsByteArray() throws Exception {
        byte[] data = new byte[32];
        Arrays.fill(data, (byte) 0);
        byte[] signature = new byte[32];
        Arrays.fill(signature, (byte) 0);
        KeyPair keyPair = generateRandomKeyPair();
        byte[] result = keyPair.sign(data);
        assertNotNull(result);
    }

}