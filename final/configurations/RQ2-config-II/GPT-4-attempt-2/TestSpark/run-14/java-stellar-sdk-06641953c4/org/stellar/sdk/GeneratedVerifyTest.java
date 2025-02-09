package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        EdDSAPublicKey mockKey = mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockKey);
        byte[] data = "data".getBytes();
        byte[] signature = "signature".getBytes();
        assertEquals(false, keyPair.verify(data, signature));
    }

}