package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedVerifyWithInvalidDataAndSignatureReturnsFalse {

    @Test
    public void verifyWithInvalidDataAndSignatureReturnsFalse() {
        byte[] invalidData = createByteArray("invaliddata");
        Signature signature = new Signature(invalidData, "signature");
        KeyPair keyPair = KeyPair.fromSecretSeed(createCharArray("1234567890"));
        assertFalse(keyPair.verify(invalidData, signature));
    }

}