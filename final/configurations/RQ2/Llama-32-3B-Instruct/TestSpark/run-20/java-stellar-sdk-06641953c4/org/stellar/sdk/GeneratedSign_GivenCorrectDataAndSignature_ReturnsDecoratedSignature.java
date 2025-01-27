package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedSign_GivenCorrectDataAndSignature_ReturnsDecoratedSignature {

    @Test
    public void sign_GivenCorrectDataAndSignature_ReturnsDecoratedSignature() throws NoSuchAlgorithmException {
        KeyPair keyPair = new KeyPair(KeyPairGenerator.generate());
        byte[] data = "my_data".getBytes();
        DecoratedSignature decoratedSignature = keyPair.sign(data);
        assertNotNull(decoratedSignature);
    }

}