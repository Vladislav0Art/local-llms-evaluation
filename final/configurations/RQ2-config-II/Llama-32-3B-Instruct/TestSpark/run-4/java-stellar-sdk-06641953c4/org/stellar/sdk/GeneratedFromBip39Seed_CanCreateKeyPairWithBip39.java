package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import java.security.GeneralSecurityException;
import java.util.Arrays;

public class GeneratedFromBip39Seed_CanCreateKeyPairWithBip39 {

    @Test
    public void fromBip39Seed_CanCreateKeyPairWithBip39() {
        byte[] bip39Seed = "bip39".getBytes();
        int accountNumber = 0;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
        assertTrue(keyPair.canSign());
    }

}