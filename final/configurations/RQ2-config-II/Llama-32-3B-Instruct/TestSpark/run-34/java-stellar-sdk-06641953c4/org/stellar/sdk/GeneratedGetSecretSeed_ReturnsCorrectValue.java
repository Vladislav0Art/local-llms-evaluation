package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetSecretSeed_ReturnsCorrectValue {

    @Test
    public void getSecretSeed_ReturnsCorrectValue() {
        byte[] seed = "my_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(seed, keyPair.getSecretSeed());
    }

}