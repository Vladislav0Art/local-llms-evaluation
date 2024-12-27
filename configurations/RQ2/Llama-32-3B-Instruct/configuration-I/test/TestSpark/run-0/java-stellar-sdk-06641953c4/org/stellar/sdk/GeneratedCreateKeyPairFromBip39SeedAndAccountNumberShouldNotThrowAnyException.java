package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedCreateKeyPairFromBip39SeedAndAccountNumberShouldNotThrowAnyException {

    @Test
    public void createKeyPairFromBip39SeedAndAccountNumberShouldNotThrowAnyException() {
        byte[] bip39Seed = new byte[32];
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}