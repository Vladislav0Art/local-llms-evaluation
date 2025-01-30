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

public class GeneratedVerifyMethodTest {

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