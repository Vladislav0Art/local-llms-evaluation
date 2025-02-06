package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed ReturnsInstanceWithCorrectSize {

    @Test
    public void fromSecretSeed

    ReturnsInstanceWithCorrectSize() throws GeneralSecurityException {
        byte[] seed = "my_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(32, keyPair.getPublicKey().length);
    }

}