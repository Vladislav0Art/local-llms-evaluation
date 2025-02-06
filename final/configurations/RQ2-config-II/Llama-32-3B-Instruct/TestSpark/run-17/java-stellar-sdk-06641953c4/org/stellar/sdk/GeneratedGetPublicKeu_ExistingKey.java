package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetPublicKeu_ExistingKey {

    @Test
    public void getPublicKeu_ExistingKey() {
        char[] secretSeed = "some_seed".toCharArray();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.fromSecretSeed(secretSeed));
        assertEquals(secretSeed, keyPair.getSecretSeed());
    }

}