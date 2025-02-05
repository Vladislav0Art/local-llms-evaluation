package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import static org.junit.Assert.*;

public class GeneratedSignAndVerifyTest {

    @Test
    public void signAndVerifyTest() {
        KeyPair keyPair = KeyPair.random();
        byte[] data = "data".getBytes();
        byte[] signature = keyPair.sign(data);
        assertTrue(keyPair.verify(data, signature));
    }

}