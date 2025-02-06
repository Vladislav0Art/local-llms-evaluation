package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedFromBip39SeedTest {

    @Test
    public void fromBip39SeedTest() {
        byte[] bip39Seed = "1234567890".getBytes();
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}