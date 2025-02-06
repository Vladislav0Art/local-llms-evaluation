package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedSign ReturnsCorrectSignature {

    @Test
    public void sign

    ReturnsCorrectSignature() throws GeneralSecurityException {
        byte[] data = "my_data".getBytes();
        byte[] signature = {1, 2, 3};
        KeyPair keyPair = KeyPair.fromSecretSeed("my_seed".getBytes());
        byte[] expectedSignature = keyPair.sign(data);
        assertTrue(Arrays.equals(signature, expectedSignature));
    }

}