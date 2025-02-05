package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeedArrayInvalidTest {

    @Test
    public void fromSecretSeedArrayInvalidTest() {
        byte[] seed = new byte[]{1, 2, 3}; // invalid size
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
    }

}