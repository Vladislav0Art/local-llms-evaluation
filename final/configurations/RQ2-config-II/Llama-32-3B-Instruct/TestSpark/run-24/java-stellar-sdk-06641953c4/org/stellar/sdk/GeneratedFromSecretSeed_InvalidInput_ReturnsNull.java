package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeed_InvalidInput_ReturnsNull {

    @Test
    public void fromSecretSeed_InvalidInput_ReturnsNull() {
        byte[] seed = new byte[0];
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNull(keyPair);
    }

}