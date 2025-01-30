package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;
import org.mockito.Mockito;

public class GeneratedFromSecretSeedCharArrayTest {

    @Mock
    private EdDSAPublicKey mockedPublickey;

    @Mock
    private EdDSAPrivateKey mockedPrivatekey;

    @Test
    public void fromSecretSeedCharArrayTest() {
        char[] seed = new char[]{'a', 'b', 'c', 'd', 'e', 'f'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        Assert.assertNotNull(keyPair);
    }

}