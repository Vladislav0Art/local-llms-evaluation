package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getXdrPublicKey());
    }

}