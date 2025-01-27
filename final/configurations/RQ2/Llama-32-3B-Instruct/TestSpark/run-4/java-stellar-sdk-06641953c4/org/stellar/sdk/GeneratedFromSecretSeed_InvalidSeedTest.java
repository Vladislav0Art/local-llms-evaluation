package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeed_InvalidSeedTest {

    @Test
    public void fromSecretSeed_InvalidSeedTest() {
        byte[] seed = new byte[0];
        assertNotEquals("null", KeyPair.fromSecretSeed(seed).getAccountId());
    }

}