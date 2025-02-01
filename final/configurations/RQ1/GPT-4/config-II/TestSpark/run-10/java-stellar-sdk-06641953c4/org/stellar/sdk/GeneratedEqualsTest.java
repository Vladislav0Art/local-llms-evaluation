package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertFalse(keyPair1.equals(keyPair2));
        Assert.assertTrue(keyPair1.equals(keyPair1));
    }

}