package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeed_NullSeedTest {

    @Test
    public void fromSecretSeed_NullSeedTest() {
        assertThrows(NullPointerException.class, () -> KeyPair.fromSecretSeed(null));
    }

}