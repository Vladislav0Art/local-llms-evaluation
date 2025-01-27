package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromBip39SeedReturnsNullWhenAccountNumberIsNegativeOrZero {

    @Test
    public void fromBip39SeedReturnsNullWhenAccountNumberIsNegativeOrZero() {
        byte[] bip39Seed = "1234567890".getBytes();
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNull(keyPair);
    }

}