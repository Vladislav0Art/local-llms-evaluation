package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromSecretSeed_String Works {

    @Test
    public void fromSecretSeed_String

    Works() {
        String seed = "1234567890";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getAccountId());
    }

}