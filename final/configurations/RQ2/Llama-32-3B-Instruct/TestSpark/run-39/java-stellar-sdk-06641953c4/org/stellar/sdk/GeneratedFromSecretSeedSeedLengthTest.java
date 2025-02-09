package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedFromSecretSeedSeedLengthTest {

    @Test
    public void fromSecretSeedSeedLengthTest() {
        char[] seed = {'a', 'b', 'c'};
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(3, seed.length);
    }

}