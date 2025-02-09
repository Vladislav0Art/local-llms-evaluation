package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.KeyPair;
import java.security.SignatureException;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedFromSecretSeedWithValidSeedReturnsKeypair {

    @Test
    public void fromSecretSeedWithValidSeedReturnsKeypair() throws Exception {
        byte[] seed = new byte[32];
        Arrays.fill(seed, 'a');
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}