package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedFromBip39SeedTest {

    @Mock
    private EdDSAPublicKey mockedPublickey;

    @Mock
    private EdDSAPrivateKey mockedPrivatekey;

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = new byte[]{10, 20, 30};
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, 100);
        Assert.assertNotNull(keyPair);
    }

}