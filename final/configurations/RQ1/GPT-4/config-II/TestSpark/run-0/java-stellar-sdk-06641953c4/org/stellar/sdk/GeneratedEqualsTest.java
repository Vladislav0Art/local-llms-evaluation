package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import net.i2p.crypto.eddsa.KeyPairGenerator;
import org.junit.Assert;
import org.junit.Test;
import org.stellar.sdk.KeyPair;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair first = KeyPair.random();
        KeyPair second = KeyPair.fromSecretSeed(first.getSecretSeed());

        Assert.assertTrue(first.equals(second));
    }

}