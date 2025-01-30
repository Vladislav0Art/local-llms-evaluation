package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedSignTest {

    @Test
    public void signTest() throws NoSuchAlgorithmException, UnsupportedEncodingException {
        EdDSAPublicKey publicKey = null;
        EdDSAPrivateKey privateKey = null;
        KeyPair newKeyPair = new KeyPair(publicKey, privateKey);

        String data = "Message";
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        byte[] hash = digest.digest(data.getBytes("UTF-8"));

        newKeyPair.sign(hash);
    }

}