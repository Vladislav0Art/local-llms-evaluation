package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedCanSign_GivenIncorrectSignature_ReturnsFalse {

    @Test
    public void canSign_GivenIncorrectSignature_ReturnsFalse() throws NoSuchAlgorithmException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(KeyPairGenerator.generate());
        byte[] data = "my_data".getBytes();
        byte[] signature = "incorrect_signature".getBytes();
        assertFalse(keyPair.verify(data, signature));
    }

}