package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedSign_GivenIncorrectDataAndSignature_ReturnsNull {

    @Test
    public void sign_GivenIncorrectDataAndSignature_ReturnsNull() {
        KeyPair keyPair = new KeyPair(KeyPairGenerator.generate());
        byte[] data = "incorrect_data".getBytes();
        DecoratedSignature decoratedSignature = keyPair.sign(data);
        assertNull(decoratedSignature);
    }

}