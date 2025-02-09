package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import java.security.GeneralSecurityException;

public class GeneratedSignBytesTest {

    @Test
    public void signBytesTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "TestData".getBytes();
        byte[] signature = keyPair.sign(data);
        Assert.assertNotNull(signature);
    }

}