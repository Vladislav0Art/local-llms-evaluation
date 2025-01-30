package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        EdDSAPublicKey publicKey = null;
        KeyPair newKeyPair = new KeyPair(publicKey);
        Assert.assertNotNull(newKeyPair.getAccountId());
    }

}