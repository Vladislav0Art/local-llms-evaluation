package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair keyPair1 = KeyPair.random();
        KeyPair keyPair2 = KeyPair.random();
        Assert.assertNotEquals(keyPair1.hashCode(), keyPair2.hashCode());
        Assert.assertEquals(keyPair1.hashCode(), keyPair1.hashCode());
    }

}