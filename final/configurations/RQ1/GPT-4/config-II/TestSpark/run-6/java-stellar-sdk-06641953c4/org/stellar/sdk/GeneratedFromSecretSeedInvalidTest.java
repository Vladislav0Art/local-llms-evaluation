package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GeneratedFromSecretSeedInvalidTest {

    @Test
    public void fromSecretSeedInvalidTest() {
        KeyPair.fromSecretSeed("invalid".toCharArray());
    }

}