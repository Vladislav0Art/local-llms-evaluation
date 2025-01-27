package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedConvertFromEdDSAPrivateKey_WithIncorrectSeedTest {

    @Test
    public void convertFromEdDSAPrivateKey_WithIncorrectSeedTest() {
        byte[] seed = new byte[0];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotEquals(0, keyPair.hashCode());
    }

}