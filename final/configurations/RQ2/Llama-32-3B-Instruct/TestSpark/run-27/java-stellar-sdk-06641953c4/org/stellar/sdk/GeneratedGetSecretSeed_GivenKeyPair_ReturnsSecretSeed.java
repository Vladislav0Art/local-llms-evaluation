package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetSecretSeed_GivenKeyPair_ReturnsSecretSeed {

    @Test
    public void getSecretSeed_GivenKeyPair_ReturnsSecretSeed() {
        char[] seed = "my_seed".toCharArray();
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(seed));
        assertArrayEquals(seed, keyPair.getSecretSeed());
    }

}