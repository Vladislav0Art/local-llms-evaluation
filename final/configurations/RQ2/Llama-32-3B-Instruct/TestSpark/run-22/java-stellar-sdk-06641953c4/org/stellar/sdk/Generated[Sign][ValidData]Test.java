package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Arrays;

public class Generated[Sign][ValidData]

Test {

    @Test
    public void [Sign][ValidData]Test() throws Exception {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "data".getBytes();
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}