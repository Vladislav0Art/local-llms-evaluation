package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair pair = KeyPair.random();
        Assert.assertEquals(pair.getAccountId(), pair.getAccountId());
    }

}