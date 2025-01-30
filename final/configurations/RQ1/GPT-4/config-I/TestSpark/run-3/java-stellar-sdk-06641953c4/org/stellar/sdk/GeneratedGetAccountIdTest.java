package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedGetAccountIdTest {

    @Mock
    private EdDSAPublicKey mockedPublickey;

    @Mock
    private EdDSAPrivateKey mockedPrivatekey;

    @Test
    public void getAccountIdTest() {
        Mockito.when(mockedPublickey.getAbyte()).thenReturn(new byte[]{10, 20, 30});
        KeyPair keyPair = new KeyPair(mockedPublickey, mockedPrivatekey);
        Assert.assertNotNull(keyPair.getAccountId());
    }

}