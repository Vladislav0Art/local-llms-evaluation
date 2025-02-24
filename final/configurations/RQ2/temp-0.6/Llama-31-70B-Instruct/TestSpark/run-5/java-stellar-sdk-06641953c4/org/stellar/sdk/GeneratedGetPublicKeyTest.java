package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetPublicKeyTest {

    @Test
    public void getPublicKeyTest() {
        KeyPair keyPair = new KeyPair(null);
        byte[] publicKey = keyPair.getPublicKey();
        assertNotNull(publicKey);
    }

}