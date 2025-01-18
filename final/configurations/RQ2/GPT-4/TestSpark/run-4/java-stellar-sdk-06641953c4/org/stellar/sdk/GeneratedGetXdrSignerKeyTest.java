package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedGetXdrSignerKeyTest {

    @Test
    public void getXdrSignerKeyTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromPublicKey(byteArr);
        Assert.assertNotNull(fakeKeyPair.getXdrSignerKey());
    }

}