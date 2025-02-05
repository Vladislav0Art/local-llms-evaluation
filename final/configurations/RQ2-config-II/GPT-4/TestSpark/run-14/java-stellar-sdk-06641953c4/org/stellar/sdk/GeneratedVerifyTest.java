package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.DecoratedSignature;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        byte[] data = "data".getBytes();
        byte[] signature = "signature".getBytes();
        String seed = "secret";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair.verify(data, signature));
    }

}