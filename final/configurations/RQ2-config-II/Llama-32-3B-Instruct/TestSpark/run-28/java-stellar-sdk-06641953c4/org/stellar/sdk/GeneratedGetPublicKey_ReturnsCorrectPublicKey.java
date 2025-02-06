package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetPublicKey_ReturnsCorrectPublicKey {

    @Test
    public void getPublicKey_ReturnsCorrectPublicKey() {
        byte[] publicKey = {1, 2, 3};
        KeyPair keyPair = new KeyPair(publicKey);
        assertArrayEquals(publicKey, keyPair.getPublicKey());
    }

}