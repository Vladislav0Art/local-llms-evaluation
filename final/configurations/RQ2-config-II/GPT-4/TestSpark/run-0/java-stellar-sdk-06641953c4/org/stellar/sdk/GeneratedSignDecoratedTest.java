package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.mockito.Mockito.mock;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        KeyPair pair = KeyPair.random();
        byte[] data = "test".getBytes();
        DecoratedSignature signature = pair.signDecorated(data);
        Assert.assertNotNull(signature);
    }

}