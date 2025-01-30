package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedFromAccountIdTest {

    @Test
    public void fromAccountIdTest() {
        String accountId = "GARBCBH4YSHUJLYEPKEPMVYZIJ3ZSQR3QCJ245CWGY64X72JLN4UQSOH";
        KeyPair keyPair = KeyPair.fromAccountId(accountId);
        Assert.assertEquals(keyPair.getAccountId(), accountId);
    }

}