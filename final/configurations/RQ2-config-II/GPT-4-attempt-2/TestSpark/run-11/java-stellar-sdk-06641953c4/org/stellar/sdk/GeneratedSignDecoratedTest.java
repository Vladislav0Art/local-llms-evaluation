package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedSignDecoratedTest {

    @Test
    public void signDecoratedTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = {1, 2, 3, 4};
        DecoratedSignature decoratedSignature = keyPair.signDecorated(data);
        Assert.assertNotNull(decoratedSignature);
    }

}