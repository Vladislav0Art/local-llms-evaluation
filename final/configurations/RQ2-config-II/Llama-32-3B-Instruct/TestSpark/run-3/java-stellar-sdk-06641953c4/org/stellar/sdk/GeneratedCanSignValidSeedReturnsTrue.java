package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCanSignValidSeedReturnsTrue {

    @Test
    public void canSignValidSeedReturnsTrue() throws GeneralSecurityException, IOException {
        char[] seed = "valid_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertTrue(keyPair.canSign());
    }

}