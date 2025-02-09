package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedSignDataNotValidSignatureTest {

    @Test
    public void signDataNotValidSignatureTest() {
        byte[] data = "Hello".getBytes();
        byte[] signature = {1, 2, 3};
        assertFalse(KeyPair.random().sign(data), Arrays.equals(signature, new byte[0]));
    }

}