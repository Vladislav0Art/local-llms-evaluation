package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = new byte[32];
        KeyPair newKeyPair = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(newKeyPair);
    }

}