package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4};
        byte[] signature = keyPair.sign(data);
        boolean isVerified = keyPair.verify(data, signature);
        Assert.assertTrue(isVerified);
    }

}