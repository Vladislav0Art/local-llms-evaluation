package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getPublicKey());
    }

}