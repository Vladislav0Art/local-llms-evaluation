package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class GeneratedFromSecretSeedSeedTypeTest {

    @Test
    public void fromSecretSeedSeedTypeTest() {
        String seed = "abc";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertArrayEquals("abc".getBytes(), seed.getBytes());
    }

}