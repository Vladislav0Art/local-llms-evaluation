package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "123456";
        KeyPair newKeyPair = KeyPair.fromAccountId(accountId);
        Assert.assertNotNull(newKeyPair);
    }

}