package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedNewKeyPair_random_returnsNewKeyPair {

    @Test
    public void newKeyPair_random_returnsNewKeyPair() {
        KeyPair keyPair = KeyPair.random();
        assertNotNull(keyPair);
    }

}