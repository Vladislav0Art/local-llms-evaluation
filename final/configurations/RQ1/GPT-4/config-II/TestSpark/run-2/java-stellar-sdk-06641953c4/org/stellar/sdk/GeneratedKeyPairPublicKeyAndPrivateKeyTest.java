package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedKeyPairPublicKeyAndPrivateKeyTest {

    @Test
    public void KeyPairPublicKeyAndPrivateKeyTest() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] publicKey = new byte[32];
        byte[] privateKey = new byte[32];
        secureRandom.nextBytes(publicKey);
        secureRandom.nextBytes(privateKey);

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKey, KeyPair.ed25519)),
                new EdDSAPrivateKey(privateKey));

        Assert.assertNotNull(keyPair);
        Assert.assertTrue(keyPair.canSign());
    }

}