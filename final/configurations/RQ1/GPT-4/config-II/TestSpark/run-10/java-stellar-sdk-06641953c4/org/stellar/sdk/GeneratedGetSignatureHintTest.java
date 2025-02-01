package org.stellar.sdk;

import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.security.MessageDigest;

public class GeneratedGetSignatureHintTest {

    @Test
    public void getSignatureHintTest() {
        KeyPair keyPair = KeyPair.random();
        Assert.assertNotNull(keyPair.getSignatureHint());
    }

}