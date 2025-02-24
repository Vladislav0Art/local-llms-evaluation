package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.assertEquals;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        assertEquals(new byte[]{1, 2, 3}, keyPair.getPublicKey());
    }

}