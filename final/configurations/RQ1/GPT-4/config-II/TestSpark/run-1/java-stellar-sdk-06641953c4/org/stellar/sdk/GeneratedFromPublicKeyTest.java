package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.SignatureHint;

public class GeneratedFromPublicKeyTest {

    @Test
    public void fromPublicKeyTest() {
        byte[] publicKeyBytes = new byte[32];
        KeyPair keyPair = KeyPair.fromPublicKey(publicKeyBytes);
        Assert.assertNotNull(keyPair);
        Assert.assertArrayEquals(publicKeyBytes, keyPair.getPublicKey());
    }

}