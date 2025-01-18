package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        byte[] data = "data".getBytes();
        byte[] signature = "signature".getBytes();
        EdDSAPublicKey publicKey = new EdDSAPublicKey(null);
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertFalse(keyPair.verify(data, signature));
    }

}