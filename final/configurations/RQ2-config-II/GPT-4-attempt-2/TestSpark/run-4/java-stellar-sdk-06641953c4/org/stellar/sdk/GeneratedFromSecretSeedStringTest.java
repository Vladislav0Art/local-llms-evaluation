package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        KeyPair pair = KeyPair.fromSecretSeed("seed");
        Assert.assertNotNull(pair);
    }

}