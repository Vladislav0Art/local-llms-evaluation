package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedRandomTest {

    @Test
    public void randomTest() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}