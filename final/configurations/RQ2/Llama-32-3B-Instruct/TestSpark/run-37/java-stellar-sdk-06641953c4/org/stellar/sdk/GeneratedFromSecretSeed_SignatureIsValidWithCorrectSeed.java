package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromSecretSeed_SignatureIsValidWithCorrectSeed {

    @Test
    public void fromSecretSeed_SignatureIsValidWithCorrectSeed() throws Exception {
        // Arrange
        byte[] seed = "my_seed".getBytes();
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);

        // Act and Assert
        byte[] publicKey = keyPair.getPublicKey();
        boolean isValid = isValidSignature(publicKey, seed);
        assertTrue(isValid);
    }

}