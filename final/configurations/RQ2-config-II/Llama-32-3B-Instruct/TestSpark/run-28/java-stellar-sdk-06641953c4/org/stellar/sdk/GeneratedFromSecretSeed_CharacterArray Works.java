package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedFromSecretSeed_CharacterArray Works {

    @Test
    public void fromSecretSeed_CharacterArray

    Works() {
        char[] seed = "1234567890".toCharArray();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair.getAccountId());
    }

}