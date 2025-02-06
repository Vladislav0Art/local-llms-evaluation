package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromSecretSeedStringTest {

    @Test
    public void fromSecretSeedStringTest() {
        String seed = "1234567890";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}