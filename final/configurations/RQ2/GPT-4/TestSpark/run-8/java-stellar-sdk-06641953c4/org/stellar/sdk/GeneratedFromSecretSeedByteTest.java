package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.KeyPair;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedByteTest {

    @Test
    public void fromSecretSeedByteTest() {
        KeyPair keyPair = KeyPair.fromSecretSeed(new byte[]{1, 2, 3});
        Assert.assertNotNull(keyPair);
    }

}