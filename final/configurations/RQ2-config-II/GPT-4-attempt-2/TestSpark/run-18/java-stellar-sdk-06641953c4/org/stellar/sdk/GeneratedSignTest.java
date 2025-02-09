package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = new byte[]{1, 2, 3};
        byte[] signature = keyPair.sign(data);
        Assert.assertNotNull(signature);
    }

}