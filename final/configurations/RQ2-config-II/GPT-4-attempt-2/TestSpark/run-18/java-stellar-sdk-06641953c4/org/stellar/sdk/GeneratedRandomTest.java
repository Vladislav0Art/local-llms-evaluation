package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair);
    }

}