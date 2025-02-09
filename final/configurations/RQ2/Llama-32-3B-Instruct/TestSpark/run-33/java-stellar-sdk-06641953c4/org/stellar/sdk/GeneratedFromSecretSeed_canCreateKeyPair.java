package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedFromSecretSeed_canCreateKeyPair {

    @Test
    public void fromSecretSeed_canCreateKeyPair() {
        char[] seed = "secret_seed_123".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}