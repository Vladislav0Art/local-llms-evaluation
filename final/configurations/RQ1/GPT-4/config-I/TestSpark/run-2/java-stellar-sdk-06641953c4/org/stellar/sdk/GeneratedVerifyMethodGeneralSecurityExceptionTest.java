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

public class GeneratedVerifyMethodGeneralSecurityExceptionTest {

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

}