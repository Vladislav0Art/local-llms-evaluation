package org.stellar.sdk;

import org.junit.Test;
import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), (EdDSAPrivateKey) keyPair.getPrivate());
        assertTrue(stellarKeyPair.canSign());
    }

}