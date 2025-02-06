package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_String {

    @Test
    public void fromSecretSeed_String() {
        String seed = "string";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(16, ((char[]) keyPair.getSecretSeed()).length);
    }

}