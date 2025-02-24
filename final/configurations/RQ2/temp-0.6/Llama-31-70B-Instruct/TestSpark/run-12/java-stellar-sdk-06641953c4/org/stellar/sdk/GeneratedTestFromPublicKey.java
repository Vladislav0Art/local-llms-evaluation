package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

public class GeneratedTestFromPublicKey {

    @Test
    public void testFromPublicKey() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[10]);
        Assert.assertEquals(0, keyPair.getPublicKey().length);
    }

}