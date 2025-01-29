package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GeneratedTestRandomKeyPair {

    @Mock
    private EdDSAPublicKey mockEdDSAPublicKey;

    @Test
    public void testRandomKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertTrue(KeyPair.canSign());
    }

}