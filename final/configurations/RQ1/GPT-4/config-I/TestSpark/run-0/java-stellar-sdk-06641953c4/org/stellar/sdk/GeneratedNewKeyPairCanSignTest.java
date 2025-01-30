package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedNewKeyPairCanSignTest {

    @Test
    public void newKeyPairCanSignTest() {
        EdDSAPublicKey publicKey = null;
        EdDSAPrivateKey privateKey = null;
        KeyPair newKeyPair = new KeyPair(publicKey, privateKey);
        Assert.assertTrue(newKeyPair.canSign());
    }

}