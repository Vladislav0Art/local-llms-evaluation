package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class GeneratedKeyPairPublicKeyOnlyTest {

    @Test
    public void KeyPairPublicKeyOnlyTest() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] publicKey = new byte[32];
        secureRandom.nextBytes(publicKey);

        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(new EdDSAPublicKeySpec(publicKey, KeyPair.ed25519)));

        Assert.assertNotNull(keyPair);
        Assert.assertFalse(keyPair.canSign());
    }

}