package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedVerify_GivenIncorrectDataAndSignature_ReturnsFalse {

    @Test
    public void verify_GivenIncorrectDataAndSignature_ReturnsFalse() throws NoSuchAlgorithmException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(KeyPairGenerator.generate());
        byte[] data = "my_data".getBytes();
        byte[] signature = "incorrect_signature".getBytes();
        assertFalse(keyPair.verify(data, signature));
    }

}