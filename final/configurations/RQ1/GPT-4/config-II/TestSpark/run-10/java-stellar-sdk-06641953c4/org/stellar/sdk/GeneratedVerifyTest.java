package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        byte[] data = "sampleData".getBytes();
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data);
        Assert.assertTrue(keyPair.verify(data, signature));
    }

}