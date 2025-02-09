package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed("test".toCharArray());
        Assert.assertNotNull(keyPair);
    }

}