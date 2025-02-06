package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedGetPublicKey_returnsPublicKey {

    @Test
    public void getPublicKey_returnsPublicKey() {
        byte[] publicKey = "public".getBytes();
        KeyPair keyPair = KeyPair.fromPublicKey(publicKey);
        assertNotNull(keyPair.getPublicKey());
    }

}