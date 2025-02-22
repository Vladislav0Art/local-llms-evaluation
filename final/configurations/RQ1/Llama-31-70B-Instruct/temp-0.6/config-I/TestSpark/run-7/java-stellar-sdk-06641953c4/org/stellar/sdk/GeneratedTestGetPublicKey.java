package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTestGetPublicKey {

    @Test
    public void testGetPublicKey() {
        KeyPair keyPair = new KeyPair();
        byte[] publicKey = keyPair.getPublicKey();
        assertEquals("expected publicKey", publicKey);
    }

}