package org.stellar.sdk;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class GeneratedVerifyInvalidSignatureTest {

    @Test
    public void verifyInvalidSignatureTest() {
        String data = "Test signature";
        KeyPair keyPair = KeyPair.random();
        byte[] signature = keyPair.sign(data.getBytes());
        assertFalse(keyPair.verify("Invalid data".getBytes(), signature));
    }

}