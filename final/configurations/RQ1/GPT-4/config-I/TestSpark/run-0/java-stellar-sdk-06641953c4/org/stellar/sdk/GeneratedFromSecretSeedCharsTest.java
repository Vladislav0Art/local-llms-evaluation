package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedFromSecretSeedCharsTest {

    @Test
    public void fromSecretSeedCharsTest() {
        char[] seed = new char[32];
        KeyPair newKeyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(newKeyPair);
    }

}