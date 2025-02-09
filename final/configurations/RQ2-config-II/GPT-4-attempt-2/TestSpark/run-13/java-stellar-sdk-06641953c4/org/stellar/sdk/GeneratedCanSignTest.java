package org.stellar.sdk;

import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertTrue(keyPair.canSign());
    }

}