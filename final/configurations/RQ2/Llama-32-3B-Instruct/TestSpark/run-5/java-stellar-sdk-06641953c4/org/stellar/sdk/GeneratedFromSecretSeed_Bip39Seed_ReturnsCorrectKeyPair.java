package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromSecretSeed_Bip39Seed_ReturnsCorrectKeyPair {

    @Test
    public void fromSecretSeed_Bip39Seed_ReturnsCorrectKeyPair() {
        byte[] bip39Seed = {4, 5, 6};
        int accountNumber = 7;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}