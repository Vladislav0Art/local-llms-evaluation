package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedGetPublicKey_GivenKeyPair_ReturnsPublicKey {

    @Test
    public void getPublicKey_GivenKeyPair_ReturnsPublicKey() {
        byte[] publicKey = new byte[32];
        Arrays.fill(publicKey, 0x00);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(publicKey));
        assertArrayEquals(publicKey, keyPair.getPublicKey());
    }

}