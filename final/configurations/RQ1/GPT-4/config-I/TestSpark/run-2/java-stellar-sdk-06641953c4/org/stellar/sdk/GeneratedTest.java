package org.stellar.sdk;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;

import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.SignatureException;

public class GeneratedTest {

    @Test
    public void KeyPairCreationTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        Assert.assertTrue(keyPair.canSign());
    }

    @Test
    public void signMethodPrivateKeyNullTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        byte[] data = new byte[10];
        keyPair.sign(data);
    }

    @Test
    public void signMethodTest() throws GeneralSecurityException {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);

        byte[] data = new byte[10];
        byte[] result = keyPair.sign(data);
        Assert.assertNotNull(result);
    }

    @Test
    public void verifyMethodGeneralSecurityExceptionTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);

        boolean result = false;
        try {
            result = keyPair.verify(new byte[10], new byte[10]);
        } catch (RuntimeException e) {
            Assert.assertEquals("General security exception", e.getMessage());
        }
        Assert.assertFalse(result);
    }

    @Test
    public void verifyMethodTest() throws GeneralSecurityException {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);

        byte[] data = new byte[10];
        byte[] signature = new byte[10];

        boolean result = keyPair.verify(data, signature);
        Assert.assertFalse(result);
    }

}