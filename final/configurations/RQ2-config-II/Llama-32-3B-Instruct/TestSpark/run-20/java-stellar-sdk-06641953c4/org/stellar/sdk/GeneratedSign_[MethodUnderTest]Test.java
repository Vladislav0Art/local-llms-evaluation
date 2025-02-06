package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.Signature;
import java.util.Arrays;

public class GeneratedSign_[MethodUnderTest]

Test {

    @Test
    public void sign_[ MethodUnderTest]Test() throws GeneralSecurityException {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "data".getBytes();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        Signature signature = keyPair.sign(data);
        assertTrue(signature.verify(data, signature));
    }

}