package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

public class GeneratedTestFromSecretSeed {

    @Test
    public void testFromSecretSeed() {
        KeyPair keyPair = KeyPair.fromSecretSeed("seed");
        Assert.assertEquals("", keyPair.getAccountId());
    }

}