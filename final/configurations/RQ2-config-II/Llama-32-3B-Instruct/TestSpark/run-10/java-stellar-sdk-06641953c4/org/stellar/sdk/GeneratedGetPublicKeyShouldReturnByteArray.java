package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetPublicKeyShouldReturnByteArray {

    @Test
    public void getPublicKeyShouldReturnByteArray() {
        byte[] expectedKey = new byte[]{1, 2, 3};
        when(new KeyPair(expectedKey)).getPublicKey().thenReturn(expectedKey);
        assertEquals(expectedKey, new KeyPair(expectedKey).getPublicKey());
    }

}