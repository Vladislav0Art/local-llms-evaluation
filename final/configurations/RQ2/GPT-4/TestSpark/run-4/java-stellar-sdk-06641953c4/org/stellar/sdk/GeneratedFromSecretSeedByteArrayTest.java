package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.stellar.sdk.xdr.PublicKeyType;
import org.stellar.sdk.xdr.SignerKeyType;

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] byteArr = new byte[32];
        KeyPair fakeKeyPair = KeyPair.fromSecretSeed(byteArr);
        Assert.assertNotNull(fakeKeyPair);
    }

}