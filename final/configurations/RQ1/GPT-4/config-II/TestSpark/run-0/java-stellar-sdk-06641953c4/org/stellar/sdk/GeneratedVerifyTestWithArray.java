package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedVerifyTestWithArray {

    @Test
    public void verifyTestWithArray() {
        KeyPair pair = KeyPair.random();
        byte[] data = "Test".getBytes();
        byte[] sig = pair.sign(data);
        Assert.assertTrue(pair.verify(data, sig));
    }

}