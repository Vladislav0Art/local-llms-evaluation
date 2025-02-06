package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedFromBip39Seed_ValidInput_ReturnsInstance {

    @Test
    public void fromBip39Seed_ValidInput_ReturnsInstance() throws GeneralSecurityException {
        byte[] bip39Seed = new byte[16];
        int accountNumber = 123;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}