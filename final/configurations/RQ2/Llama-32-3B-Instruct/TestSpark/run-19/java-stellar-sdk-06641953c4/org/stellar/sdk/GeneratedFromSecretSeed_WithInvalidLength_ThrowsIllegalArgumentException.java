package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_WithInvalidLength_ThrowsIllegalArgumentException {

    @Test
    public void fromSecretSeed_WithInvalidLength_ThrowsIllegalArgumentException() {
        // Arrange
        byte[] seed = new byte[0];

        // Act
        KeyPair keyPair = KeyPair.fromSecretSeed(seed);
    }

}