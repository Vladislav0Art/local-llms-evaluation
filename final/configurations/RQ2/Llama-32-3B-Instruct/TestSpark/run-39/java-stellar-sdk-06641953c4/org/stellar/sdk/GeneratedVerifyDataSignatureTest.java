package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedVerifyDataSignatureTest {

    @Test
    public void verifyDataSignatureTest() throws NoSuchAlgorithmException {
        KeyPair keyPair = KeyPair.fromPublicXdrKey(new byte[]{1, 2, 3});
        byte[] data = "Hello".getBytes();
        byte[] signature = {4, 5, 6};
        assertTrue(keyPair.verify(data, signature));
    }

}