package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.SignatureException;

public class GeneratedTestFromAccountId {

    @Test
    public void testFromAccountId() {
        KeyPair keyPair = KeyPair.fromAccountId("accountId");
        Assert.assertEquals("accountId", keyPair.getAccountId());
    }

}