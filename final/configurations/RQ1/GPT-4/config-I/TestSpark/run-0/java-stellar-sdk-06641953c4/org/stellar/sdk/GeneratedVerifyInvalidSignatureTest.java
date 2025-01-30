package org.stellar.sdk;

import org.junit.Test;
import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedVerifyInvalidSignatureTest {

    @Test
    public void verifyInvalidSignatureTest() throws NoSuchAlgorithmException {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), (EdDSAPrivateKey) keyPair.getPrivate());

        String data = "Message";
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        byte[] hash = digest.digest(data.getBytes());

        byte[] signature = stellarKeyPair.sign(hash);
        hash[0] = (byte) ~hash[0];
        assertFalse(stellarKeyPair.verify(hash, signature));
    }

}