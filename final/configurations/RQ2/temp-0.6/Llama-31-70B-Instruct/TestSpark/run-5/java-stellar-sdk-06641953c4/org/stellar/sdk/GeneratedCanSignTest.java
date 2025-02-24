package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedCanSignTest {

    @Test
    public void canSignTest() {
        KeyPair keyPair = new KeyPair(null);
        boolean canSign = keyPair.canSign();
        assertTrue(canSign);
    }

}