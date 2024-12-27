package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedVerifySignatureWithInvalidSeedAndDataShouldReturnFalse {

    @Test
    public void verifySignatureWithInvalidSeedAndDataShouldReturnFalse() {
        byte[] seed = new byte[32];
        byte[] data = new byte[32];
        assertFalse(KeyPair.fromSecretSeed(seed).verify(data, new byte[0]));
    }

}