package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
        byte[] wrongData = new byte[]{4, 5, 6};
        Assert.assertFalse(keyPair.verify(wrongData, signature));
    }

}