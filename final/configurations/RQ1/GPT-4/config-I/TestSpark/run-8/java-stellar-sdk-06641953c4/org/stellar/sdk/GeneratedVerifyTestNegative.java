package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.StrKey;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;

import java.nio.charset.StandardCharsets;

public class GeneratedVerifyTestNegative {

    @Test
    public void verifyTestNegative() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        byte[] data = "test data".getBytes(StandardCharsets.UTF_8);
        byte[] data2 = "another test data".getBytes(StandardCharsets.UTF_8);
        byte[] signature = keyPair1.sign(data);
        Assert.assertFalse(keyPair2.verify(data2, signature));
    }

}