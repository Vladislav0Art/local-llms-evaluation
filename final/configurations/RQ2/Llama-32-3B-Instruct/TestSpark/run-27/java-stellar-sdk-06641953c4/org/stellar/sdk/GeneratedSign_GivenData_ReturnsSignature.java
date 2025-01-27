package org.stellar.sdk;

import org.stellar.sdk.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedSign_GivenData_ReturnsSignature {

    @Test
    public void sign_GivenData_ReturnsSignature() {
        byte[] data = "my_data".getBytes();
        byte[] signature = new byte[32];
        Arrays.fill(signature, 0x00);
        KeyPair keyPair = new KeyPair(new EdDSAPublicKey(signature));
        assertArrayEquals(data, keyPair.sign(data));
    }

}