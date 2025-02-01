package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedFromSecretSeedCharArrayTest {

    @Test
    public void fromSecretSeedCharArrayTest() {
        SecureRandom secureRandom = new SecureRandom();
        char[] seed = new char[32];
        Random random = new Random();
        for (int i = 0; i < seed.length; i++) {
            seed[i] = (char) (random.nextInt(26) + 'a');
        }

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

}