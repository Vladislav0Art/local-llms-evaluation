package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedSignTest {

    @Test
    public void signTest() {
        KeyPair keyPair = new KeyPair(null);
        byte[] data = new byte[10];
        byte[] signature = keyPair.sign(data);
        assertNotNull(signature);
    }

}