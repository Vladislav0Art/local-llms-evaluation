package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair pair = KeyPair.random();
        byte[] data = "Test".getBytes();
        Assert.assertNotNull(pair.sign(data));
    }

}