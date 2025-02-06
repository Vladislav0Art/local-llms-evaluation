package org.stellar.sdk;

import org.junit.Test;

import static org.junit.Assert.*;

import org.stellar.sdk.KeyPair;

public class GeneratedNewKeyPair_fromBip39Seed_byteArray_accountNumber_returnsNewKeyPair {

    @Test
    public void newKeyPair_fromBip39Seed_byteArray_accountNumber_returnsNewKeyPair() {
        byte[] bip39Seed = "secret".getBytes();
        int accountNumber = 1;
        KeyPair keyPair = KeyPair.fromBip39Seed(bip39Seed, accountNumber);
        assertNotNull(keyPair);
    }

}