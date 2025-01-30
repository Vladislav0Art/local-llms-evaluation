package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedNotEqualsNullTest {

    @Test
    public void notEqualsNullTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertFalse(keyPair.equals(null));
    }

}