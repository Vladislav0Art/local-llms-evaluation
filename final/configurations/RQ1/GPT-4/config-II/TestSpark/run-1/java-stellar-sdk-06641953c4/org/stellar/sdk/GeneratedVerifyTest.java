package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.SignatureHint;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws Exception {
        byte[] data = "some data".getBytes();
        byte[] signature = "signature".getBytes();
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(publicKey);
        EdDSAEngine mockedEngine = Mockito.mock(EdDSAEngine.class);
        Mockito.when(mockedEngine.verify(Mockito.any())).thenReturn(true);
        boolean result = keyPair.verify(data, signature);
        Assert.assertTrue(result);
    }

}