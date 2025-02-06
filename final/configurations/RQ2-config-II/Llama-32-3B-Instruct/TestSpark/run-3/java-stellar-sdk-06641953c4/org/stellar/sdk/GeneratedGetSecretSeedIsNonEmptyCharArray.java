package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedGetSecretSeedIsNonEmptyCharArray {

    @Test
    public void getSecretSeedIsNonEmptyCharArray() {
        char[] seed = "valid_seed".getBytes();
        KeyPair keyPair = new KeyPair(EdDSAPublicKey.generate());
        assertNot null (keyPair.getSecretSeed());
        assertTrue(!keyPair.getSecretSeed().length == 0);
    }

}