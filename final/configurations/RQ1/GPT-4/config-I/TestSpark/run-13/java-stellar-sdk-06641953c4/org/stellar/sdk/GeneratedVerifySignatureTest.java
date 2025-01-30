package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class GeneratedVerifySignatureTest {

    @Test
    public void verifySignatureTest() {
        String data = "Test signature";
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data.getBytes());
        assertTrue(keyPair.verify(data.getBytes(), signature));
    }

}