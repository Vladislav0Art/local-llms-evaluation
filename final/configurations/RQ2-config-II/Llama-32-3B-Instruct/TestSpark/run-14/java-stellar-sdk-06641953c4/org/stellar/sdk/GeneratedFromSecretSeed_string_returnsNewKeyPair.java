package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedFromSecretSeed_string_returnsNewKeyPair {

    @Test
    public void fromSecretSeed_string_returnsNewKeyPair() {
        String seed = "secret";
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
        assertNotNull(keyPair);
    }

}