package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "Test Secret Seed";

        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

}