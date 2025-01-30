package org.stellar.sdk;

import org.junit.Test;
import net.i2p.crypto.eddsa.*;
import net.i2p.crypto.eddsa.spec.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void canSignTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), (EdDSAPrivateKey) keyPair.getPrivate());
        assertTrue(stellarKeyPair.canSign());
    }

    @Test
    public void getKeyPairWithoutPrivateKeyTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic());
        assertFalse(stellarKeyPair.canSign());
    }

    @Test
    public void signWithoutPrivateKeyTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic());

        byte[] data = new byte[100];
        stellarKeyPair.sign(data);
    }

    @Test
    public void signWithPrivateKeyTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), (EdDSAPrivateKey) keyPair.getPrivate());

        byte[] data = new byte[100];
        assertNotNull(stellarKeyPair.sign(data));
    }

    @Test
    public void verifyValidSignatureTest() throws NoSuchAlgorithmException {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), (EdDSAPrivateKey) keyPair.getPrivate());

        String data = "Message";
        MessageDigest digest = MessageDigest.getInstance("SHA-512");
        byte[] hash = digest.digest(data.getBytes());

        byte[] signature = stellarKeyPair.sign(hash);
        assertTrue(stellarKeyPair.verify(hash, signature));
    }

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

    @Test
    public void getPublicKeyTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair stellarKeyPair = new KeyPair((EdDSAPublicKey) keyPair.getPublic(), (EdDSAPrivateKey) keyPair.getPrivate());

        assertNotNull(stellarKeyPair.getPublicKey());
        assertTrue(Arrays.equals(stellarKeyPair.getPublicKey(), ((EdDSAPublicKey) keyPair.getPublic()).getAbyte()));
    }

    @Test
    public void getSecretSeedTest() {
        net.i2p.crypto.eddsa.KeyPairGenerator keyPairGenerator = new net.i2p.crypto.eddsa.KeyPairGenerator();
        java.security.KeyPair keyPair = keyPairGenerator.generateKeyPair();
        KeyPair fromSecretSeed = KeyPair.fromSecretSeed(((EdDSAPrivateKey) keyPair.getPrivate()).getSeed());

        assertNotNull(fromSecretSeed.getSecretSeed());
    }

    @Test
    public void fromPublicKeyInvalidKeyTest() {
        KeyPair.fromPublicKey(new byte[33]);
    }

}