package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair newKeyPair = KeyPair.random();
        Assert.assertNotNull(newKeyPair);
    }

}