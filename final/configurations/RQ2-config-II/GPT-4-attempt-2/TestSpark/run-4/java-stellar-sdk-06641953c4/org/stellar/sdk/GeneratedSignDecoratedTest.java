package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        DecoratedSignature decorated = keyPair.signDecorated("test".getBytes());
        Assert.assertNotNull(decorated);
    }

}