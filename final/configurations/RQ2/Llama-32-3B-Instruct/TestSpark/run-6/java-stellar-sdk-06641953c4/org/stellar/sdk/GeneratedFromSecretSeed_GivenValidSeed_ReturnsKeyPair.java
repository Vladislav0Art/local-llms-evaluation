package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromSecretSeed_GivenValidSeed_ReturnsKeyPair {

    @Test
    public void fromSecretSeed_GivenValidSeed_ReturnsKeyPair() throws Exception {
        byte[] seed = new byte[32];
        Arrays.fill(seed, (byte) 0);
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}