package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedVerify_GivenCorrectDataAndSignature_ReturnsTrue {

    @Test
    public void verify_GivenCorrectDataAndSignature_ReturnsTrue() throws NoSuchAlgorithmException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(KeyPairGenerator.generate());
        byte[] data = "my_data".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}