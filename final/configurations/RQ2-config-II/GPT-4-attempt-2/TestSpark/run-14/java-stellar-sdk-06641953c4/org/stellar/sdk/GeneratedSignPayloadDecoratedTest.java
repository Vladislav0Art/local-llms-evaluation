package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedSignPayloadDecoratedTest {

    @Test
    public void signPayloadDecoratedTest() {
        EdDSAPublicKey mockKey = mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockKey);
        byte[] data = "data".getBytes();
        assertNull(keyPair.signPayloadDecorated(data));
    }

}