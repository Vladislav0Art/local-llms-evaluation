package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedVerifyWithValidDataAndSignatureReturnsTrue {

    @Test
    public void verifyWithValidDataAndSignatureReturnsTrue() {
        byte[] data = createByteArray("data");
        Signature signature = new Signature(data, "signature");
        KeyPair keyPair = KeyPair.fromSecretSeed(createCharArray("1234567890"));
        assertTrue(keyPair.verify(data, signature));
    }

}