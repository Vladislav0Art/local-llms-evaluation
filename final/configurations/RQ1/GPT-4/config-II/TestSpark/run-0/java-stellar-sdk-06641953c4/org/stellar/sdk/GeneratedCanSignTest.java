package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertTrue(pair.canSign());

        java.security.KeyPair keyPair = new KeyPairGenerator().generateKeyPair();
        pair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), null);
        Assert.assertFalse(pair.canSign());
    }

}