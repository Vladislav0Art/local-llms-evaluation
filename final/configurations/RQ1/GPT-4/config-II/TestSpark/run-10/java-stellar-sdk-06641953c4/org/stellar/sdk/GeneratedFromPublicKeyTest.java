package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKey = MessageDigest.getInstance("SHA-256").digest("randomString".getBytes());
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        Assert.assertNotNull(keyPair);
    }

}