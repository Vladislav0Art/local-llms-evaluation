package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class GeneratedFromBip39Seed_canCreateKeyPair {

    @Test
    public void fromBip39Seed_canCreateKeyPair() {
        byte[] bip39Seed = "bip39_seed_123".getBytes();
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}