package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromBip39Seed_InvalidSeedTest {

    @Test
    public void fromBip39Seed_InvalidSeedTest() {
        byte[] seed = "invalid".getBytes();
        assertNotEquals("null", KeyPair.fromBip39Seed(seed, 0).getAccountId());
    }

}