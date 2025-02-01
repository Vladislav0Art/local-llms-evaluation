package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.SignatureHint;

public class GeneratedKeyPairPublicConstructorTest {

    @Test
    public void KeyPairPublicConstructorTest() {
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        Assert.assertNotNull(keyPair);
        Assert.assertEquals(publicKey, keyPair.getPublicKey());
    }

}