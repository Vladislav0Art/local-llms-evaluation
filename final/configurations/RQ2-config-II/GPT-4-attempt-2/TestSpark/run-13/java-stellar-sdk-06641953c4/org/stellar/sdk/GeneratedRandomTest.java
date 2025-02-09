package org.stellar.sdk;

import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getPublicKey());
    }

}