package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        EdDSAPublicKey mockKey = mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockKey);
        byte[] data = "data".getBytes();
        assertNull(keyPair.sign(data));
    }

}