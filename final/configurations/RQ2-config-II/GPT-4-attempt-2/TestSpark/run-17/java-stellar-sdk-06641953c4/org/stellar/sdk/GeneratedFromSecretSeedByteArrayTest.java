package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedByteArrayTest {

    @Test
    public void fromSecretSeedByteArrayTest() {
        byte[] seed = new byte[]{1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

}