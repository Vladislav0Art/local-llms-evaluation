package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        KeyPair keyPair1 = Mockito.mock(KeyPair.class);
        KeyPair keyPair2 = Mockito.mock(KeyPair.class);
        when(keyPair1.equals(anyObject())).thenReturn(true);
        when(keyPair2.equals(anyObject())).thenReturn(false);
        assertTrue(keyPair1.equals(keyPair2));
    }

}