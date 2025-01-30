package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "SEED";
        KeyPair newKeyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(newKeyPair);
    }

}