package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() {
        byte[] seed = new byte[32];
        KeyPair newKeyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(newKeyPair);
    }

}