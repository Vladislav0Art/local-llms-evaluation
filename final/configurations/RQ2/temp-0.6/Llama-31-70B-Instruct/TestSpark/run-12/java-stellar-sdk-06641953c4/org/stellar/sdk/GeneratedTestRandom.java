package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

public class GeneratedTestRandom {

    @Test
    public void testRandom() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair);
    }

}