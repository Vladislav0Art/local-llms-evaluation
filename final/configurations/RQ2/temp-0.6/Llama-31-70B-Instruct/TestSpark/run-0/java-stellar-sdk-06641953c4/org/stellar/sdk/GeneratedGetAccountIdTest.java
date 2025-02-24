package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetAccountIdTest {

    @Test
    public void getAccountIdTest() {
        KeyPair keyPair = mock(KeyPair.class);
        when(keyPair.getAccountId()).thenReturn("test");
        assertEquals("test", keyPair.getAccountId());
    }

}