package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.io.ByteArrayOutputStream;

public class GeneratedFromBip39Seed_givenBip39SeedingAccountNumberWhenReturnCorrectKeyPair {

    @Test
    public void fromBip39Seed_givenBip39SeedingAccountNumberWhenReturnCorrectKeyPair() {
        byte[] bip39Seed = "bip39seed".getBytes();
        int accountNumber = 123; // hardcoded for simplicity
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        XdrDataOutputStream writer = new XdrDataOutputStream(out);
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair.getPublicKey());
    }

}