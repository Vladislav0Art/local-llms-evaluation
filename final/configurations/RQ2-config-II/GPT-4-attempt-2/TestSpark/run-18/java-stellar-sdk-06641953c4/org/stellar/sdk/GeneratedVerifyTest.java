package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

}