package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromSecretSeed_GivenSeedLengthReturnsKeyPair {

    @Test
    public void fromSecretSeed_GivenSeedLengthReturnsKeyPair() throws GeneralSecurityException, IOException {
        KeyPair keyPair = KeyPair.fromSecretSeed("seed".getBytes());
        assertNotNull(keyPair);
    }

}