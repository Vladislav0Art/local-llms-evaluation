package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedSignAndVerifyTest {

    @Test
    public void signAndVerifyTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "stellar";
        byte[] signature = keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
        Assert.assertTrue(keyPair.verify(data.getBytes(), signature));
    }

}