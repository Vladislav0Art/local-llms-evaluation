package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedSignTest {

    @Test
    public void signTest() throws GeneralSecurityException, IOException {
        byte[] data = "Hello World!".getBytes();
        KeyPair keyPair = Mockito.mock(KeyPair.class);
        when(keyPair.sign(data)).thenReturn("signature".getBytes());
        assertArrayEquals("signature".getBytes(), keyPair.sign(data));
    }

}