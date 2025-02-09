package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertTrue(keyPair.canSign());
    }

}