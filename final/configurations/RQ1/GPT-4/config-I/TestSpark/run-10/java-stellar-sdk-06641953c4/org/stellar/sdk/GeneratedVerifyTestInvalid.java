package org.stellar.sdk;

import org.junit.Test;
import org.stellar.sdk.KeyPair;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedVerifyTestInvalid {

    @Test
    public void verifyTestInvalid() {
        KeyPair keyPair = KeyPair.random();
        byte[] invalidSignature = "invalid_signature".getBytes(StandardCharsets.UTF_8);
        String data = "Test Data";
        keyPair.verify(data.getBytes(StandardCharsets.UTF_8), invalidSignature);
    }

}