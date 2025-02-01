package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertArrayEquals(pair.getPublicKey(), pair.getPublicKey());
    }

}