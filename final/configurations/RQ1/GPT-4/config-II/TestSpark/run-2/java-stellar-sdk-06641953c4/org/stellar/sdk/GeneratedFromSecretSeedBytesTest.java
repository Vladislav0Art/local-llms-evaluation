package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedFromSecretSeedBytesTest {

    @Test
    public void fromSecretSeedBytesTest() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] seed = new byte[32];
        secureRandom.nextBytes(seed);

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

}