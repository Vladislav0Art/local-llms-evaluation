package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.Signature;
import java.util.Arrays;

public class GeneratedFromBip39Seed_GivenValidSeedAndAccountNumber_ReturnsKeyPair {

    @Test
    public void fromBip39Seed_GivenValidSeedAndAccountNumber_ReturnsKeyPair() {
        byte[] bip39Seed = new byte[32];
        Arrays.fill(bip39Seed, (byte) 0);
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}