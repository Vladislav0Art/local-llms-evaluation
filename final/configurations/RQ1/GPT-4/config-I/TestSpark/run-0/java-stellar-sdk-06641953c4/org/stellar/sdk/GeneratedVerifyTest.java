package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        EdDSAPublicKey publicKey = null;
        KeyPair newKeyPair = new KeyPair(publicKey);

        String data = "Message";
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        byte[] hash = digest.digest(data.getBytes("UTF-8"));

        byte[] signature = newKeyPair.sign(hash);

        Assert.assertTrue(newKeyPair.verify(hash, signature));
    }

}