package org.stellar.sdk;

import org.junit.Test;
import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeedTest {

    @Test
    public void getSecretSeedTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair fromSecretSeed = KeyPair.fromSecretSeed(((EdDSAPrivateKey) keyPair.getPrivate()).getSeed());

        assertNotNull(fromSecretSeed.getSecretSeed());
    }

}