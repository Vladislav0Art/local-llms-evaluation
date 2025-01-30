package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetSecretSeedTest {

    @Mock
    private EdDSAPublicKey mockedPublickey;

    @Mock
    private EdDSAPrivateKey mockedPrivatekey;

    @Test
    public void getSecretSeedTest() {
        Mockito.when(mockedPrivatekey.getSeed()).thenReturn(new byte[]{10, 20, 30});
        KeyPair keyPair = new KeyPair(mockedPublickey, mockedPrivatekey);
        Assert.assertNotNull(keyPair.getSecretSeed());
    }

}