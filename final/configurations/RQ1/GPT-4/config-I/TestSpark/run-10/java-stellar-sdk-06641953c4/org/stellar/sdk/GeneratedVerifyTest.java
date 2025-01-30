package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedVerifyTest {

    @Test
    public void verifyTest() {
        KeyPair keyPair = KeyPair.random();
        String data = "Test Data";
        byte[] signature = keyPair.sign(data.getBytes(StandardCharsets.UTF_8));
        assertTrue(keyPair.verify(data.getBytes(StandardCharsets.UTF_8), signature));
    }

}