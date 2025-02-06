package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        KeyPair keyPair = Mockito.mock(KeyPair.class);
        when(keyPair.hashCode()).thenReturn(123L);
        assertEquals(123L, keyPair.hashCode());
    }

}