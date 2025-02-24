package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedPublicKeyTest {

    @Test
    public void publicKeyTest() {
        KeyPair keyPair = KeyPair.fromPublicKey(new byte[]{0, 1, 2, 3});
        assertArrayEquals(keyPair.getPublicKey(), new byte[]{0, 1, 2, 3});
    }

}