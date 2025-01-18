package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        Assert.assertNotNull(KeyPair.random());
    }

}