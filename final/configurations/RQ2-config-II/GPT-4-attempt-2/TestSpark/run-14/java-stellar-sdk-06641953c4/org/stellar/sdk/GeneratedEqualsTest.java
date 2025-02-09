package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.xdr.PublicKey;
import org.stellar.sdk.xdr.SignerKey;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        EdDSAPublicKey mockKey = mock(EdDSAPublicKey.class);
        KeyPair keyPair = new KeyPair(mockKey);
        KeyPair keyPair2 = new KeyPair(mockKey);
        assertTrue(keyPair.equals(keyPair2));
    }

}