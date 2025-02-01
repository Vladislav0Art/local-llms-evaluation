package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedSignWithoutPrivateKeyTest {

    @Test
    public void signWithoutPrivateKeyTest() {
        KeyPair keyPairWithoutPrivateKey = KeyPair.random();
        byte[] data = "Test data".getBytes();

        keyPairWithoutPrivateKey.sign(data);
    }

}