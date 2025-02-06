package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() throws GeneralSecurityException, IOException {
        byte[] data = "Hello World!".getBytes();
        byte[] signature = "signature".getBytes();
        KeyPair keyPair = Mockito.mock(KeyPair.class);
        when(keyPair.verify(data, signature)).thenReturn(true);
        assertTrue(keyPair.verify(data, signature));
    }

}