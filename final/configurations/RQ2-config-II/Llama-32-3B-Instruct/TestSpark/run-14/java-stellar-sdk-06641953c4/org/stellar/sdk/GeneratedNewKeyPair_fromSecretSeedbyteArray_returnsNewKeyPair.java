package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedNewKeyPair_fromSecretSeedbyteArray_returnsNewKeyPair {

    @Test
    public void newKeyPair_fromSecretSeedbyteArray_returnsNewKeyPair() {
        byte[] seed = "secret".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}