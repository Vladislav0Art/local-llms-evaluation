package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedVerify_GivenDataAndSignature_ReturnsTrue {

    @Test
    public void verify_GivenDataAndSignature_ReturnsTrue() {
        byte[] data = "my_data".getBytes();
        byte[] signature = new byte[32];
        Arrays.fill(signature, 0x00);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(signature));
        assertTrue(keyPair.verify(data, signature));
    }

}