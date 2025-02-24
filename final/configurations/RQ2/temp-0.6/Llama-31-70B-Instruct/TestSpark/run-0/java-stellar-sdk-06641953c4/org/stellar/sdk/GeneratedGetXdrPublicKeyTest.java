package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetXdrPublicKeyTest {

    @Test
    public void getXdrPublicKeyTest() {
        KeyPair keyPair = mock(KeyPair.class);
        PublicKey publicKey = mock(PublicKey.class);
        when(keyPair.getXdrPublicKey()).thenReturn(publicKey);
        assertEquals(publicKey, keyPair.getXdrPublicKey());
    }

}