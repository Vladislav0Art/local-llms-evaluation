package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSignDecorated.

SignsWithSignatureCorrectly {

    @Test
    public void signDecorated.SignsWithSignatureCorrectly() throws GeneralSecurityException {
        byte[] data = "Hello World".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed("1234567890".toCharArray());
        DecoratedSignature decoratedSignature = new DecoratedSignature(data, signature(keyPair.sign(data)));
        assertTrue(decoratedSignature.verify(data));
    }

}