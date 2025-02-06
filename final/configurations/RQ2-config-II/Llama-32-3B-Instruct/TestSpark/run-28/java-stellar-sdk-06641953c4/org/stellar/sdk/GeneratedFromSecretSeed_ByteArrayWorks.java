package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromSecretSeed_ByteArrayWorks {

    @Test
    public void fromSecretSeed_ByteArrayWorks() {
        byte[] seed = "1234567890".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getAccountId());
    }

}