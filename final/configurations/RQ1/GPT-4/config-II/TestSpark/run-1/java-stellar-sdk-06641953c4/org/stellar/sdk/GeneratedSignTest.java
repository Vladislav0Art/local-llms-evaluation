package org.stellar.sdk;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mockito;
import net.i2p.crypto.eddsa.EdDSAEngine;
import net.i2p.crypto.eddsa.EdDSAPrivateKey;
import net.i2p.crypto.eddsa.EdDSAPublicKey;
import org.stellar.sdk.xdr.SignatureHint;

public class GeneratedSignTest {

    @Test
    public void signTest() throws Exception {
        byte[] data = "some data".getBytes();
        EdDSAPublicKey publicKey = Mockito.mock(EdDSAPublicKey.class);
        EdDSAPrivateKey privateKey = Mockito.mock(EdDSAPrivateKey.class);
        KeyPair keyPair = new KeyPair(publicKey, privateKey);
        EdDSAEngine mockedEngine = Mockito.mock(EdDSAEngine.class);
        Mockito.when(mockedEngine.sign(Mockito.any())).thenReturn(data);
        keyPair.sign(data);
        Mockito.verify(mockedEngine).sign(data);
    }

}