package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedRandomReturnsValidKeyPair {

    @Test
    public void randomReturnsValidKeyPair() throws Exception {
        KeyPair key = KeyPair.random();
        assertNotNull(key);
    }

}