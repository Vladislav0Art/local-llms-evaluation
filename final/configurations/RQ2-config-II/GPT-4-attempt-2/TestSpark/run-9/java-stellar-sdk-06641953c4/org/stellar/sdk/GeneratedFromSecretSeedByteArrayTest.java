package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("test".getBytes());
        Assert.assertNotNull(keyPair);
    }

}