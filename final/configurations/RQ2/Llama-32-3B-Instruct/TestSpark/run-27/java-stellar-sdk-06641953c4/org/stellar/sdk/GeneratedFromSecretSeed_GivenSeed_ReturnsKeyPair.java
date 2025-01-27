package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromSecretSeed_GivenSeed_ReturnsKeyPair {

    @Test
    public void fromSecretSeed_GivenSeed_ReturnsKeyPair() {
        char[] seed = "my_seed".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}