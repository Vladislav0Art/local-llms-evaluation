package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedGetSecretSeed_CharsReturnSameLength {

    @Test
    public void getSecretSeed_CharsReturnSameLength() {
        char[] seed = "chars".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertEquals(16, keyPair.getSecretSeed().length);
    }

}