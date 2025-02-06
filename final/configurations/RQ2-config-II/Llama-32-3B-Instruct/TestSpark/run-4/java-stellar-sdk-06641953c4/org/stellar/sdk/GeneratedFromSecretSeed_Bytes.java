package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_Bytes {

    @Test
    public void fromSecretSeed_Bytes() {
        byte[] seed = "bytes".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
        assertEquals(16, ((byte[]) keyPair.getSecretSeed()).length);
    }

}