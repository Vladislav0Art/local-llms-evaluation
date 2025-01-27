package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_givenString_seed_shouldCreateValidKeyPair {

    @Test
    public void fromSecretSeed_givenString_seed_shouldCreateValidKeyPair() throws GeneralSecurityException {
        String seed = "random_seed";
        KeyPair key_pair = KeyPair.fromSecretSeed(seed);
        assertNotNull(key_pair);
    }

}