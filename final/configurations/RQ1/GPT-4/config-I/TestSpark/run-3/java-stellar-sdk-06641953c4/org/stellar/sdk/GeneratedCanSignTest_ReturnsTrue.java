package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedCanSignTest_ReturnsTrue {

    @Mock
    private EdDSAPublicKey mockedPublickey;

    @Mock
    private EdDSAPrivateKey mockedPrivatekey;

    @Test
    public void canSignTest_ReturnsTrue() {
        KeyPair keyPair = new KeyPair(mockedPublickey, mockedPrivatekey);
        Assert.assertTrue(keyPair.canSign());
    }

}