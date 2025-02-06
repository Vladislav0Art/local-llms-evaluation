package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromSecretSeed_GivenSeedIncorrectLengthThrowsGeneralSecurityException {

    @Test
    public void fromSecretSeed_GivenSeedIncorrectLengthThrowsGeneralSecurityException() throws GeneralSecurityException, IOException {
        assertThrows(GeneralSecurityException.class, () -> KeyPair.fromSecretSeed("short".getBytes()));
    }

}