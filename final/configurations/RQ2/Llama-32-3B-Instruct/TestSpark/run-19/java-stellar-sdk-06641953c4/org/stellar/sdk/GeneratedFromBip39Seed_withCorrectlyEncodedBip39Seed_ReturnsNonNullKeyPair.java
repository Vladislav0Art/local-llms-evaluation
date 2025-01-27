package org.stellar.sdk;

import net.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromBip39Seed_withCorrectlyEncodedBip39Seed_ReturnsNonNullKeyPair {

    @Test
    public void fromBip39Seed_withCorrectlyEncodedBip39Seed_ReturnsNonNullKeyPair() {
        // Arrange
        byte[] bip39Seed = new byte[]{0x01};
        int accountNumber = 0;

        // Act and Assert
        assertNotEquals(null, KeyPair.fromBip39Seed(bip39Seed, accountNumber));
    }

}