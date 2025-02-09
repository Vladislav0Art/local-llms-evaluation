package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.SignerKeyType;
import org.stellar.sdk.xdr.XdrDataOutputStream;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] publicKey = keyPair.getPublicKey();
        Assert.assertNotNull(publicKey);
    }

}