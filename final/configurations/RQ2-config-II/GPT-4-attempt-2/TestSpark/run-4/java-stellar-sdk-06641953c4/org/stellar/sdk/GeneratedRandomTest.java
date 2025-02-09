package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import org.stellar.sdk.xdr.DecoratedSignature;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertNotNull(pair);
    }

}