package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(byteArr);
        byte[] signature = fakeKeyPair.sign(byteArr);
        Assert.assertTrue(fakeKeyPair.verify(byteArr, signature));
    }

}