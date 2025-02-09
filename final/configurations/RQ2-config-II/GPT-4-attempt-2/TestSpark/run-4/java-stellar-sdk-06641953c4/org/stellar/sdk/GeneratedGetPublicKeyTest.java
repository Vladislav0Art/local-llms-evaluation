package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        Assert.assertNotNull(publicKey);
    }

}