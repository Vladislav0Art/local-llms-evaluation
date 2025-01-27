package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class GeneratedGenerateKeyPair_GivenBip39Seed_ReturnsCorrectKeyPair {

    @Test
    public void generateKeyPair_GivenBip39Seed_ReturnsCorrectKeyPair() throws NoSuchAlgorithmException, GeneralSecurityException {
        byte[] bip39Seed = "my_bip39_seed".getBytes();
        int accountNumber = 123;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertEquals(2, keyPair.getPublicKey().getEncodedLength());
        assertEquals(32, keyPair.getSignerKey().getEncodedLength());
    }

}