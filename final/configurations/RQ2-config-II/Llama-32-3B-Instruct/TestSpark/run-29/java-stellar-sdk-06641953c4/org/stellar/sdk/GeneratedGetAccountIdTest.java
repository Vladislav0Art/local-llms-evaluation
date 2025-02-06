package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = Mockito.mock(KeyPair.class);
        when(keyPair.getAccountId()).thenReturn("XED4B6G2F8A2JG3L9C7P1H5T6V3D4");
        assertEquals("XED4B6G2F8A2JG3L9C7P1H5T6V3D4", keyPair.getAccountId());
    }

}