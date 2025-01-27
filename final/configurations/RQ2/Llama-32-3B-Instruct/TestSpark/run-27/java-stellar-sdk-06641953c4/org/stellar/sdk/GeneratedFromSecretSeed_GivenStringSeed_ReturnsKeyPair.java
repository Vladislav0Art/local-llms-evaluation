package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromSecretSeed_GivenStringSeed_ReturnsKeyPair {

    @Test
    public void fromSecretSeed_GivenStringSeed_ReturnsKeyPair() {
        String seed = "my_seed";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}