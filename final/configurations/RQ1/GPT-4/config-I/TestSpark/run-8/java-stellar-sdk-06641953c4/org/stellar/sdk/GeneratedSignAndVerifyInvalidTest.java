package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedSignAndVerifyInvalidTest {

    @Test
    public void signAndVerifyInvalidTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "stellar";
        byte[] signature = keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
        Assert.assertFalse(keyPair.verify("invalid".getBytes(), signature));
    }

}