package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_Chars {

    @Test
    public void fromSecretSeed_Chars() {
        char[] seed = "chars".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(16, keyPair.getSecretSeed().length);
    }

}