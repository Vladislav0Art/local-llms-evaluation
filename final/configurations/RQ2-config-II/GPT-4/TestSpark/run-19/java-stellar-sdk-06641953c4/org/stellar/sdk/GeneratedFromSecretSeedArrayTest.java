package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedArrayTest {

    @Test
    public void fromSecretSeedArrayTest() {
        byte[] seed = new byte[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}