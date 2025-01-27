package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedCanSign_GivenCorrectSignature_ReturnsTrue {

    @Test
    public void canSign_GivenCorrectSignature_ReturnsTrue() throws NoSuchAlgorithmException, GeneralSecurityException {
        KeyPair keyPair = new KeyPair(KeyPairGenerator.generate());
        byte[] data = "my_data".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}