package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertFromEdDSAPublicKey_WithCorrectSeedTest {

    @Test
    public void convertFromEdDSAPublicKey_WithCorrectSeedTest() {
        byte[] seed = "1234567890".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(xdrPublicKey, keyPair.getPublicKey());
    }

}