package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_givenByteArray_seed_shouldCreateValidKeyPair {

    @Test
    public void fromSecretSeed_givenByteArray_seed_shouldCreateValidKeyPair() throws GeneralSecurityException {
        byte[] seed = "random_seed".getBytes();
        KeyPair key_pair = KeyPair.fromSecretSeed(seed);
        assertNotNull(key_pair);
    }

}