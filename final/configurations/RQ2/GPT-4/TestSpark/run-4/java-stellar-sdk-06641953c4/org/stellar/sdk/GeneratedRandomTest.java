package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair fakeKeyPair = KeyPair.random();
        Assert.assertNotNull(fakeKeyPair);
    }

}